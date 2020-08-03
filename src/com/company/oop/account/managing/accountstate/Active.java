package com.company.oop.account.managing.accountstate;

import com.company.oop.account.managing.AccountState;
import com.company.oop.account.managing.AccountUnfrozen;

import java.math.BigDecimal;
import java.util.function.Consumer;

public class Active implements AccountState{

    private AccountUnfrozen onUnfrozen;

    public Active(AccountUnfrozen onUnfrozen) {
        this.onUnfrozen = onUnfrozen;
    }

    @Override
    public AccountState deposit(BigDecimal amount, Consumer<BigDecimal> addToBalance) {
        addToBalance.accept(amount);
        return this;
    }

    @Override
    public AccountState withdraw(BigDecimal balance, BigDecimal amount, Consumer<BigDecimal> subtractFromBalance) {
        if (balance.compareTo(amount) >= 0){
            subtractFromBalance.accept(amount);
        }
        return this;
    }

    @Override
    public AccountState freezeAccount() {
        return null;
    }

    @Override
    public AccountState holderVerified() {
        return null;
    }

    @Override
    public AccountState closeAccount() {
        return new Closed();
    }
}
