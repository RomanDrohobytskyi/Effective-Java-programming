package effective.java.com.functional.programming.bank.module.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class Loan {
    private Long id;
    private Date start;
    private Date due;
    private BigDecimal amount;
    private BigDecimal balance;
    private Bank bank;

    @Override
    public String toString() {
        return id +
                ", star=" + start +
                ", due=" + due +
                ", amount=" + amount +
                ", balance=" + balance +
                ", \nbank=" + bank;
    }
}
