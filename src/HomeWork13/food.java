package HomeWork13;

enum Food {
    CARROT("Тыква", false),
    APPLE("Арбуз", true),
    PORRIDGE("Борщ", false),
    SAUSAGE("Пицца", true),
    SOUP("Харчо", false),
    PANCAKES("Блины", true);

    private String foodName;
    private boolean isTasty;

    Food(String foodName, boolean isTasty) {
        this.foodName = foodName;
        this.isTasty = isTasty;
    }

    public String getFoodName(Food food) {
        return foodName;
    }

    public boolean isTasty(Food food) {
        return isTasty;
    }
}