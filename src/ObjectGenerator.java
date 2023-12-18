import java.util.ArrayList;
import java.util.List;
public class ObjectGenerator {

    private static final int CountAccount = 6;
    private static final int CountHuman = 6;
    private static final int CountCards = 6;

    private static final List<Goods> goods = new ArrayList<>();

    public static void generate() {
        for (int i = 0; i < CountHuman; i++) {
            System.out.println(new Human("Artur" + i, 4 + i));
        }

        for (int i = 0; i < CountAccount; i++) {
            System.out.println(new Account("userName" + i, "userPassword" + i));
        }

        for (int i = 0; i < CountCards; i++) {
            System.out.println(new BankCard());
        }

        showGoods();
    }

    public static void showGoods() {
        makeGoods();
        for (Goods currentGoods : goods) {
            System.out.println(currentGoods.toString());
        }
    }

    private static void makeGoods() {
        goods.add(new Goods("Hyundai Staria", 2350100, 1));
        goods.add(new Goods("Lamborghini Huracan 2021", 13662000, 2));
        goods.add(new Goods("Mercedes-Benz GLE-Class 2021", 5774220 , 3));
        goods.add(new Goods("Ford Kuga", 1085000, 4));
        goods.add(new Goods("Audi Q8", 3515600, 5));
        goods.add(new Goods("Volvo XC90 2023", 3342389, 6));
        goods.add(new Goods("Land Rover Range Rover Velar 2.0", 3665904, 7));
        goods.add(new Goods("Citroen C5 Aircross", 1152220, 8));
        goods.add(new Goods("BMW X7", 4199588, 9));
        goods.add(new Goods("Jaguar F-Pace", 4297848, 10));
    }

    public static List<Goods> getGoods() {
        return goods;
    }
}
