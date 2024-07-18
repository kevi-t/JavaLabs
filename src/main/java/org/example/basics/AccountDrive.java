package org.example.basics;

public class AccountDrive {
    public static void main(String[] args)
    {
        AccountType type = AccountType.Deposit;
        for (AccountType at : AccountType.values())
            System.out.println(at+", Value: "+at.name()+", ord:"+ at.ordinal());

        String code = type.getCode();
        System.out.println(code);
    }
}
