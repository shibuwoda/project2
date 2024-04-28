public class OrderTest {
    public static void main(String[] args) {
        ShoppingAddress address = new ShoppingAddress("余", "浙江省", "杭州市", "西湖区", "1234567890");
        Order order = new Order("谭", "54321", 200.0, address);
        System.out.println("订单信息:\n" + order.toString() + "\n");


        order.setStatus("已付款");
        System.out.println("修改后订单信息:\n" + order.toString() + "\n");


        ShoppingAddress newAddress = new ShoppingAddress("徐", "北京市", "北京市", "朝阳区", "9876543210");
        order.setAddress(newAddress);
        System.out.println("修改后订单信息:\n" + order.toString());
    }
}