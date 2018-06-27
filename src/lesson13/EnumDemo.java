package lesson13;

public class EnumDemo {
    public enum Sauce{
        MILD("soft flavour"),
        SPICY("mexican spicy sauce"),
        MIX("half-spicy sauce with dill");

        private String description;

        Sauce(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    }
}
