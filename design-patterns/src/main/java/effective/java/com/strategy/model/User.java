package effective.java.com.strategy.model;

import effective.java.com.strategy.card.ShoppingCart;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class User {
    private String firstname;
    private String lastname;
    private String email;
    @Builder.Default
    private ShoppingCart shoppingCart = new ShoppingCart();

}
