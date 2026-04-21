package com.jcodes21.retail_banking_app.account.service;
import com.jcodes21.retail_banking_app.account.entity.AccountType;
import java.math.BigDecimal;

public class AccountService {
    AccountType accountType;
    String accountNumber;
    String sortCode;
    BigDecimal balance;
    String firstName;
    String LastName;
    String middleNames;
    String email;

    // methods
    public static void createAccount() {


        take the user details and add it to the account record being created in the db
        generate account number
        generate sort code
        db.save();
    };

    public static void getAccount(){

    }

    public static void getAllAccounts{

    }

    public void freezeAccount(){

    }

    public static void deleteAccount(){

    }

    public static void deposit(){

    }

    public static void withdraw(){
    }


}
