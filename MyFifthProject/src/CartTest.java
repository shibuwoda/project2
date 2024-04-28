public class CartTest {
    public static void main(String[] args) {
        ShoppingCart myCart = new ShoppingCart("jrs");
        myCart.addItem(new CartItem("001", "洗发水", 20.0, 1));
        myCart.addItem(new CartItem("001", "洗发水", 20.0, 2));
        myCart.addItem(new CartItem("002", "牙膏", 10.0, 1));
        myCart.addItem(new CartItem("003", "酸奶", 5.0, 2));
        System.out.println("-------------加入商品后-------------------------");
        System.out.println(myCart.toString());
        System.out.println("-------------修改商品数量后-------------------------");
        myCart.setQuantity(0,4);
        System.out.println(myCart.toString());
        System.out.println("-------------移除商品后-------------------------");
        myCart.removeItem(1);
        System.out.println(myCart.toString());
        System.out.println("-------------清空购物车后-------------------------");
        myCart.clearCart();
        System.out.println(myCart.toString());

    }
}