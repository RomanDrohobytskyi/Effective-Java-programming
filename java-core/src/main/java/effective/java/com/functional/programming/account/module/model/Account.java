package effective.java.com.functional.programming.account.module.model;

import effective.java.com.functional.programming.bank.module.model.Gender;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "email")
public class Account {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private LocalDate birthday;
    private Gender gender;
    private LocalDate creationDate;
    private BigDecimal balance = BigDecimal.ZERO;
}
