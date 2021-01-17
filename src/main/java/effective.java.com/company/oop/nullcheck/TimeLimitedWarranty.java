package effective.java.com.company.oop.nullcheck;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Optional;

public class TimeLimitedWarranty implements Warranty {

    private LocalDate dateIssued;
    private Duration validFor;

    public TimeLimitedWarranty(LocalDate dateIssued, Duration validFor) {
        this.dateIssued = dateIssued;
        this.validFor = validFor;
    }

    @Override
    public Warranty on(LocalDate date) {
        return date.compareTo(this.dateIssued) < 0 ? Warranty.VOID
                : date.compareTo(this.getExpireDate()) > 0 ? Warranty.VOID
                : this;
    }

    private LocalDate getExpireDate() {
        return this.dateIssued.plusDays(this.getValidForDays());
    }

    private Long getValidForDays() {
        return validFor.toDays();
    }

    @Override
    public Optional<Warranty> filter(LocalDate date) {
        return date.compareTo(this.dateIssued) >= 0 && date.compareTo(this.getExpireDate()) <= 0
                ? Optional.of(this)
                : Optional.empty();
    }
}
