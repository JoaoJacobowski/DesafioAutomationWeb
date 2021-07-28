package Utils;

import com.github.javafaker.Faker;

import java.util.Locale;

public class FakerGenerator {

    private static Faker faker = new Faker(new Locale("pt-BR"));

    public static String getFirstName(){
        return faker.name().firstName();
    }

    public static String getLastName(){ return faker.name().lastName(); }

    public static String getAddress() { return faker.address().streetAddress(); }

    public static String getCity() { return faker.address().city();}

    public static String getState() { return faker.address().state(); }

    public static String getPostalCode() { return faker.address().zipCode(); }

    public static String getCountry() { return faker.address().country(); }

    public static String getPhoneNumber(){ return faker.phoneNumber().cellPhone(); }

    public static String getAlternativeAdrress() { return faker.address().secondaryAddress(); }

    public static String getEmailAddress(){
        return faker.internet().emailAddress();
    }
}