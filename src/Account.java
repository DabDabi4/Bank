import java.util.Random;
public class Account {

    private String userName;
    private String userPassword;
    private double balance;
    private int id = new Random().nextInt(999);

    public Account(String userName, String userPassword) {
        this.userName = userName;
        this.userPassword = userPassword;
    }


    public double getbalance() {
        return balance;
    }

    public void plusTobalance(double balance) {
        this.balance += balance;
    }

    public void subtractFrombalance(double balance) {
        this.balance -= balance;
    }

    @Override
    public String toString() {
        return "Ім'я користувача: " + userName + "; Пароль користувача: " + userPassword + "; ID: " + id;
    }
}
