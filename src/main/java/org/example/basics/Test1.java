package org.example.basics;
import java.util.UUID;

public class Test1 {

    public static void main(String[] args) {
        //String referralCode = UUID.randomUUID().toString().toUpperCase().substring(0, 10);
        UUID uuid = UUID.randomUUID();
        String randomUUIDString = uuid.toString().toUpperCase().substring(0, 10).replaceAll("-", "A");
        String referenceCode = "TUCN" + randomUUIDString;
        System.out.println("Referral code: " + referenceCode);
    }
}