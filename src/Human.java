import java.util.ArrayList;
import java.util.List;

public class Human {

    private Account account;
    private String username;
    private int userage;
    private List<BankCard> cards = new ArrayList<>();

    public Human(String username, int userage) {
        this.username = username;
        this.userage = userage;
    }

    public void registerAccount(String userName, String userPassword) {
        this.account = new Account(userName, userPassword);
    }


    public void addBankCard(BankCard bankCard) {
        cards.add(bankCard);
    }

    public List<BankCard> getBankCards() {
        return cards;
    }

    public Account getAccount() {
        return account;
    }

    public String getName() {
        return username;
    }

    public int getAge() {
        return userage;
    }

    public String toString() {
        if (this.account != null) {
            return "Ім'я: " + username + "\n" + "Вік: " + userage + "\n"
                + "------------------------ Обліковий запис людини------------------------ " + "\n"
                + account.toString();
        }
        return null;
    }
}

