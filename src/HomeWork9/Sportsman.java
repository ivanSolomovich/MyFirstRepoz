package HomeWork9;

    public class Sportsman extends Human {
        public Sportsman(String name) {
            super(name);
        }
            @Override
            public void run() {
                System.out.println("Носится как угорелый");
            }
            @Override
            public void swim () {
                System.out.println("Плывёт мощно, спортивно, красиво");
            }
        }

