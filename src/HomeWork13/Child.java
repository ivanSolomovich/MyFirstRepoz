package HomeWork13;

    public class Child {
        public void tasteDish(Food food) throws ChildDissatisfiedException {
            if (!food.isTasty(food)) {
                throw new ChildDissatisfiedException(food.getFoodName(food) +
                        " - это амерзительно! Но спасибо, хотяб это схаваю");
            }

            System.out.println(food.getFoodName(food) + " - Норм Едища!! Спасибо огромное!!!");
        }
    }

