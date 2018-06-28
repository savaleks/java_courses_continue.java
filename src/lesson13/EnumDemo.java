package lesson13;

class EnumDemo {
    public enum Sauce{
        MILD("soft flavour"),
        SPICY("mexican spicy sauce"),
        MIX("half-spicy sauce with dill");

        private final String description;

        Sauce(String description) {
            this.description = description;
        }

        String getDescription() {
            return description;
        }

        @Override
        public String toString() {
            return description;
        }
    }
}
