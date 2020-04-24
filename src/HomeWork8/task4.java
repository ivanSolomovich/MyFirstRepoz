package HomeWork8;

import java.util.Arrays;

public class task4 {
    public static void main(String[] args) {
        String[] goods = new String[3];
        goods[0] = "Фейри";
        goods[1] = "Ламборгини";
        goods[2] = "Доска";
        Contract myContract = new Contract(50, 25, goods);
        Act myAct = convertor.convertFromContract(myContract,"Ivanov");
        System.out.println(myAct.toString());
        System.out.println(myAct.date);
    }
}

class convertor {
    public static Act convertFromContract(Contract C, String name) {
        return new Act(C.getNumber(), C.getDate(), C.getGoods(),name);
    }
}

class Contract {
    int number;
    int date;
    String[] goods;

    public Contract(int number, int date, String[] goods) {
        this.number = number;
        this.date = date;
        this.goods = goods;
    }

    public int getNumber() {
        return number;
    }

    public int getDate() {
        return date;
    }

    public String[] getGoods() {
        return goods;
    }
}

class Act {
    int number;
    int date;
    String[] goods;
    String name;


    @Override
    public String toString() {
        return "Act{" +
                "number=" + number +
                ", date=" + date +
                ", name=" + name +
                ", goods=" + Arrays.toString(goods) +
                '}';
    }

    public Act(int number, int date, String[] goods, String name) {
        this.number = number;
        this.date = date;
        this.goods = goods;
        this.name = name;
    }
}
