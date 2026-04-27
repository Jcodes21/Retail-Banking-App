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
    @Transactional
    public void createAccount() {
recieve cutomer's account details from a DTO
    validate required details
    create a new account object
    generate an account number
        generate a sort code
        set a staring balance of 0
    Save with account repository
        return the created account or a DTO response '
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

    // Spring wraps this method in a database transaction.
    // If the transaction record and account balance update both succeed, it commits.
    // If anything fails, it rolls everything back.
    @Transactional
    public void deposit(){
    BigDecimal depositAmount;

        //Create transaction record;
        validateDepositAmount();
    updateBalance(balance);

    }

    public void withdraw(){
        check the funds exist to support this transaction
        update ledger to to show the new balance
    }


}
