package com.jcodes21.retail_banking_app.account.service;
import com.jcodes21.retail_banking_app.account.entity.AccountType;
import java.math.BigDecimal;
import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import java.util.Scanner;

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


    atmAuthentication(){
        Scanner userPinInput = new Scanner(System.in);
        is this pin the same pin that is asscoaitated to this card?
    }
    validateDepositAmount() {
        is this user authenticated into the atm?
                atmAuthentication(){
        }
        is this users input a number?
        depositAmount.isNum();
        is it greater than 0
                does the account exist
                is the account active
        validatidatedDepositAmount =
    }
    updateBalance(balance) {
        balance = validatedBalanceAmount + balance;
    }
    public void deposit(){
    BigDecimal depositAmount;


        //Create transaction record;
        @Transactional;
        validateDepositAmount();
    updateBalance(balance);
    commit both to the database at the same time;
    rollback if anything fails;
    }

    public void withdraw(){
        check the funds exist to support this transaction
        update ledger to to show the new balance
    }


}
