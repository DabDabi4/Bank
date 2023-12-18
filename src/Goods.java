public class Goods {

    private double priceGoods;
    private String nameGoods;
    private int indexList;

    public Goods(String goodsName, double goodsPrice, int listIndex) {
        this.nameGoods = goodsName;
        this.priceGoods = goodsPrice;
        this.indexList = listIndex;
    }

    public String toString() {
        return indexList + ". " + "Назва: " + nameGoods + "; Ціна: " + priceGoods;
    }

    public String getGoodsName() {
        return nameGoods;
    }

    public double getGoodsPrice() {
        return priceGoods;
    }

    public int getIndexList() {
        return this.indexList;
    }
}
