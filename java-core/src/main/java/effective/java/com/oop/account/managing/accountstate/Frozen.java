package effective.java.com.oop.account.managing.accountstate;

import effective.java.com.oop.account.managing.AccountState;

import java.math.BigDecimal;
import java.util.function.Consumer;

public class Frozen implements AccountState {
    @Override
    public AccountState deposit(BigDecimal amount, Consumer<BigDecimal> addToBalance) {
        return null;
    }

    @Override
    public AccountState withdraw(BigDecimal balance, BigDecimal amount, Consumer<BigDecimal> subtractFromBalance) {
        return null;
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
        return null;
    }
}
