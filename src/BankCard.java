public class BankCard {
    private Account account;

    public BankCard(Account account) {
        this.account = account;
    }

    public BankCard() {
    }

    public void addBalance(double quantity) {
            this.account.plusTobalance(quantity);
            System.out.println("Поповнення балансу на " + quantity + " гривень");
            System.out.println("На балансі: " + account.getbalance());
    }

    public void reduceBalance(double amount, Goods goods) {

            if (this.account.getbalance() > amount) {
                this.account.subtractFrombalance(amount);
                System.out.println("Ви купили " + goods.getGoodsName());
                System.out.println("Знято з балансу " + amount + " гривень");
                System.out.println("На балансі: " + account.getbalance());
            } else {
                System.out.println("Нестача коштів");
            }
        }

    public String toString() {
            return "------------------------До картки привязаний обліковий запис------------------------ " + "\n" + account.toString();
    }
}
