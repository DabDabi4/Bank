import java.util.Scanner;

public class MainBank {
    static public void Program(Human human) {
        Scanner registr = new Scanner(System.in);
        System.out.println("Створіть обліковий запис:");
        boolean isAlreadyRegistered = false;
        while (!isAlreadyRegistered) {
            System.out.println("Введіть Ім'я: ");
            String userName = registr.next();
            System.out.println("Введіть пароль: ");
            String userPassword = registr.next();
            if (Registration(userName, userPassword)) {
                human.registerAccount(userName, userPassword);
                isAlreadyRegistered = true;
            } else {
                System.out.println("Повторіть спробу!");
            }
        }
        while (true) {
            System.out.println("------------------------Головне меню------------------------");
            System.out.println("1. Створити банківську картку");
            System.out.println("2. Перевірити баланс");
            System.out.println("3. Поповнити баланс");
            System.out.println("4. Придбати товар");
            System.out.println("5. Інформація про власника та картки");
            System.out.println("Оберіть пункт меню:");
            int Menu = registr.nextInt();


            switch (Menu) {
                case 1:
                    human.addBankCard(new BankCard(human.getAccount()));
                    System.out.println("Банківська картка створена");
                    break;
                case 2:
                    System.out.println("На балансі: " + human.getAccount().getbalance());
                    break;
                case 3:
                    System.out.println("Поповнити баланс на:");
                    double amount = registr.nextDouble();
                    if (!human.getBankCards().isEmpty()) {
                        human.getBankCards().get(0).addBalance(amount);
                    } else {
                        System.out.println("Нема банківської картки");
                    }
                    break;
                case 4:
                    ObjectGenerator.showGoods();
                    System.out.println("Введіть цифру, щоб придбати товар:");
                    byte count = registr.nextByte();
                    buyGoods(count, human);
                    break;
                case 5:
                    System.out.println(human.toString() + "\n" + human.getBankCards().get(0).toString());
                    break;
                default:
                    System.out.println("Обрано невірний пункт меню");
                    break;
            }
        }
    }

    private static boolean Registration(String userName, String userPassword) {
        while (true) {
            if (userName.length() <= 12 && !userName.isEmpty()) {
                if (userPassword.length() <= 16 && userPassword.length() >= 8) {
                    System.out.println("Обліковий запис створено!");
                    return true;
                } else {
                    System.out.println("Пароль має бути більшим за 8 символів та меншим за 16 символів");
                }
            } else {
                System.out.println("Ім'я має бути більшим за 1 символ та меншим за 12 символів");
            }

            System.out.println("Повторіть спробу!");
            return false;
        }
    }

    private static void buyGoods(int number, Human human) {
        for (Goods goods : ObjectGenerator.getGoods()) {
            if (number == goods.getIndexList()) {
                if (!human.getBankCards().isEmpty()) {
                    human.getBankCards().get(0)
                        .reduceBalance(goods.getGoodsPrice(), goods);
                    return;
                } else {
                    System.out.println("Немає банківської картки");
                }
            }
        }
        System.out.println("Невірний пункт меню");
    }
}
