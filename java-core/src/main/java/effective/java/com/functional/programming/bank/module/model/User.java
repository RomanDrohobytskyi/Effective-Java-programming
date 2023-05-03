package effective.java.com.functional.programming.bank.module.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class User {
    private Long id;
    private Integer age;
    private String name;
    private Gender gender;
    private BigDecimal salary;
    private List<Loan> loans;

    @Override
    public String toString() {
        return "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", salary=" + salary +
                ", \nloans=" + loans;
    }
}
