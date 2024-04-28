import java.util.Date;

public class Order {
    private String userName;
    private String orderNo;
    private String createTime;
    private double totalPrice;
    private ShoppingAddress address;
    private String status;

    public Order(String userName, String orderNo, double totalPrice) {
        this.userName = userName;
        this.orderNo = orderNo;
        this.totalPrice = totalPrice;
        this.createTime = getCurrentTime();
        this.status = "未付款";
    }

    public Order(String userName, String orderNo, double totalPrice, ShoppingAddress address) {
        this.userName = userName;
        this.orderNo = orderNo;
        this.totalPrice = totalPrice;
        this.address = address;
        this.createTime = getCurrentTime();
        this.status = "未付款";
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getCreateTime() {
        return createTime;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public ShoppingAddress getAddress() {
        return address;
    }

    public void setAddress(ShoppingAddress address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "用户名'" + userName + '\'' +
                ", 订单号'" + orderNo + '\'' +
                ", 订单时间" + createTime + '\'' +
                ", 价格" + totalPrice +
                ", 地址" + address +
                ", 状态'" + status + '\'' +
                '}';
    }

    private String getCurrentTime() {
        Date date = new Date();
        return date.toString();
    }
}
