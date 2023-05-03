package effective.java.com.functional.programming.bank.module.model;

import lombok.Getter;

@Getter
public enum Gender {
    MALE(1, "MALE"),
    FEMALE(2, "FEMALE");

    private final int id;
    private final String description;

    Gender(int id, String description) {
        this.id = id;
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }

}
