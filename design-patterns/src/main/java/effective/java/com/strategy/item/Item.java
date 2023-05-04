package effective.java.com.strategy.item;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@Builder
@AllArgsConstructor
public class Item {
    private String name;
    private String description;
    private BigDecimal price;
}
