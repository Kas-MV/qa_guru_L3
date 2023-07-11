package demoqa.util;

import com.github.javafaker.Faker;
import demoqa.states.BaseState;

import java.security.SecureRandom;

public class RandomDataUtils extends BaseState {

    static Faker faker = new Faker();

    public static String randomString(String text, int len) {
        SecureRandom rnd = new SecureRandom();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++)
            sb.append(text.charAt(rnd.nextInt(text.length())));
        return sb.toString();
    }

    public static String randomCity(String state) {
        switch (state) {
            case "NCR": {
                String[] city = {"Delhi", "Gurgaon", "Noida"};
                return faker.options().option(city);
            }
            case "Uttar Pradesh": {
                String[] city = {"Agra", "Lucknow", "Merrut"};
                return faker.options().option(city);
            }
            case "Haryana": {
                String[] city = {"Karnal", "Panipat"};
                return faker.options().option(city);
            }
            case "Rajasthan": {
                String[] city = {"Jaipur", "Jaiselmer"};
                return faker.options().option(city);
            }
        }
        return null;
    }
}
