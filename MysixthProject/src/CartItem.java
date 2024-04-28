public class CartItem {
//    (1) 成员变量: goods，quantity，分别代表这个条目对应的商品对象、数量
    private Goods goods;
    private int quantity;

//            (2) 构造方法：2个参数，分别为goods和quantity赋初值

    public CartItem(Goods goods, int quantity) {
        this.goods = goods;
        this.quantity = quantity;
    }

//            (3) 存取2个成员变量的get和set方法

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

//(4) 返回当前条目信息的方法 public String toString()

    @Override
    public String toString() {
        return "商品id" +goods.getId()+
                "\t\t商品名" + goods.getName() +
                "\t\t商品单价" + goods.getPrice() +
                "\t\t数量" + quantity+
                "\t\t条目总价" + goods.getPrice()*quantity
                ;
    }

//    返回条目各项信息组成的字符串：“商品id\t\t商品名\t\t商品单价\t\t数量\t\t条目总价”
//    注意：条目总价 = 单价 × 数量
}
