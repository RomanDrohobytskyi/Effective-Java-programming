package com.company.oop.accountmanaging;

import java.math.BigDecimal;
import java.util.function.Consumer;

public class Account {

    private BigDecimal balance;
    private AccountState state;

    public Account(BigDecimal balance, AccountState state) {
        this.balance = balance;
        this.state = state;
    }

    public void deposit(BigDecimal amount) {
        this.state.deposit(balance, this::addToBalance);
    }

    private void addToBalance(BigDecimal amount) {
        this.balance = this.balance.add(amount);
    }


    public void withdraw(BigDecimal amount) {
        this.state = this.state.withdraw(this.balance, amount,this::subtractFromBalance);
    }

    private void subtractFromBalance(BigDecimal amount) {
        this.balance = this.balance.subtract(amount);
    }

    public void freezeAccount() {
        this.state = this.state.freezeAccount();
    }

    public void holderVerified() {
        this.state = this.state.holderVerified();
    }

    public void closeAccount() {
        this.state = this.state.closeAccount();
    }

}
