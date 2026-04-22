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
    public void createAccount() {

        take the user details and add it to the account record being created in the db
        generate account number
        generate sort code
        db.save();
    };

    public static void getAccount(){

    }

    public void getAllAccounts{

    }

    public void freezeAccount(){
        set the enum state to frozen

    }

    public void deleteAccount(){
        set the enum state to frozen
        delete account from db

    }

    public void deposit(){
        check the funds exist to support this transaction
        update ledger to update balance
    }

    public void withdraw(){
        update ledger
    }


}
