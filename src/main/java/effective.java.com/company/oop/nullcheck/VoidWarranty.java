package effective.java.com.company.oop.nullcheck;

import java.time.LocalDate;
import java.util.Optional;

public class VoidWarranty implements Warranty {

    @Override
    public void claim(Runnable action) { }

    @Override
    public Warranty on(LocalDate date) {
        return this;
    }

    public Optional<Warranty> filter(LocalDate date) { return Optional.empty(); }

}
