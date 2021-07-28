package TestCases;

import Framework.Report;
import Framework.ReportType;
import Framework.Screenshot;
import Framework.TestBase;
import PageObjects.ConfirmaEnderecoPage;
import Tasks.*;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class RealizarCompraComSucesso extends TestBase {
    private WebDriver driver = getDriver();
    private PrincipalTask principalTask = new PrincipalTask(driver);
    private ItemAdicionadoTask itemAdicionadoTask = new ItemAdicionadoTask(driver);
    private ItemProdutoTask itemProdutoTask = new ItemProdutoTask(driver);
    private CheckoutTask checkoutTask = new CheckoutTask(driver);
    private LoginTask loginTask = new LoginTask(driver);
    private CadastroDeClienteTask cadastroDeClienteTask = new CadastroDeClienteTask(driver);
    private ConfirmaEnderecoTask confirmaEnderecoTask = new ConfirmaEnderecoTask(driver);
    private EnvioTask envioTask = new EnvioTask(driver);
    private PagamentoTask pagamentoTask = new PagamentoTask(driver);
    private ConfirmaPagamentoTask confirmaPagamentoTask = new ConfirmaPagamentoTask(driver);
    private ConfirmacaoPedidoTask confirmacaoPedidoTask = new ConfirmacaoPedidoTask(driver);

    @Test
    public void realizarCompraComSucesso(){
        try {
            Report.createTest("Realizar compra com sucesso!!", ReportType.SINGLE);
            principalTask.adicionaItemAoCarrinho();
            itemAdicionadoTask.irParaCheckout();
            checkoutTask.validaItemNoCarrinho();
            checkoutTask.continuaCheckout();
            loginTask.irParaCriarUsuario();
            cadastroDeClienteTask.cadastrarCliente();
            confirmaEnderecoTask.validaEndereco();
            envioTask.aceitaTermos();
            pagamentoTask.validaValorCompra();
            pagamentoTask.selecionaPagamento();
            confirmaPagamentoTask.confirmaPagamento();
            confirmacaoPedidoTask.ValidaConfirmacaoPedido();
        } catch (Exception e){
            Report.log(Status.ERROR, e.getMessage(), Screenshot.fullPageBase64(driver));
        }

    }
}
