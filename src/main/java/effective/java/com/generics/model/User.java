package effective.java.com.generics.model;

import effective.java.com.patterns.strategy.card.ShoppingCard;

public class User {

    private String firstname;
    private String lastname;
    private String email;
    private ShoppingCard shoppingCard;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ShoppingCard getShoppingCard() {
        return shoppingCard;
    }

    public void setShoppingCard(ShoppingCard shoppingCard) {
        this.shoppingCard = shoppingCard;
    }

    public User(String firstname, String email, ShoppingCard shoppingCard) {
        this.firstname = firstname;
        this.email = email;
        this.shoppingCard = shoppingCard;
    }
}
