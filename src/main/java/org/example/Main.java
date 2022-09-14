package org.example;

import org.example.client.NumberConversion;
import org.example.client.NumberConversionSoapType;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("You need to pass in one number");
        } else {
            String number = args[0];
            NumberConversion numberConversion = new NumberConversion();
            NumberConversionSoapType conversionSoapType = numberConversion.getNumberConversionSoap();
            String words = conversionSoapType.numberToWords(BigInteger.valueOf(Long.parseLong(number)));
            System.out.println(words);
        }
    }
}