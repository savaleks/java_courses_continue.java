package lesson14;

public enum Sauce {
    MILD("soft flovour"),
    SPICY("very hot"),
    MIX("half-spicy sauce with garlic");

    private String description;

    Sauce( String description) {
        this.description = description;
    }
}
