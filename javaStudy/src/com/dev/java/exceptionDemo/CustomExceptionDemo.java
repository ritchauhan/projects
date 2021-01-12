package com.dev.java.exceptionDemo;

/**
 *
 */
class Account extends Exception {

    private int accountNo;
    private int accBal;

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public void setAccBal(int accBal) {
        this.accBal = accBal;
    }

    public int getAccountNo () {
        return this.accountNo;
    }

    public int getAccBal () {
        return this.accBal;
    }

    public boolean accountValidation(int money) throws AccountException {
        if(this.accBal <= money) {
            throw new AccountException("Insufficient Balance");
        } else {
            return true;
        }
    }

    public void deposit(int money) {
        this.accBal += money;
    }

    public void withdraw (int money) {
        this.accBal -= money;
    }
}

class AccountException extends Exception {
    public AccountException (String message) {
        super(message);
    }
}

public class CustomExceptionDemo {
    public static void main(String[] args) {
        Account account = new Account();
        account.setAccountNo(1000);
        account.setAccBal(100000);
        try {
            if(account.accountValidation(10000)) {
                account.withdraw(10000);
                System.out.println("total balance: "+ account.getAccBal());
            }
        } catch (AccountException accountException) {
            accountException.printStackTrace();
        }

        System.out.println(account.getAccBal());

    }
}
