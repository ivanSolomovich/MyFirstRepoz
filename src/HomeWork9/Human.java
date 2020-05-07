package HomeWork9;

    public abstract class Human implements Runnable, Swimable {
        private String name;

        public Human(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public abstract void run();

        public abstract void swim();
    }



