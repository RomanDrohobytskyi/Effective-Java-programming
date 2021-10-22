package effective.java.com.functional.programming.bank.module.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class Bank {
    private Long id;
    private String name;

    @Override
    public String toString() {
        return "" + id + ", " + name;
    }
}
