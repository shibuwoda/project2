public class ShoppingCart {
    private String userName;
    private CartItem[] items;
    private int count;
    private double totalPrice;

    public ShoppingCart(String userName) {
        this.userName = userName;
        this.items = new CartItem[5];
        this.count = 0;
        this.totalPrice = 0.0;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public CartItem[] getItems() {
        return items;
    }

    public int getCount() {
        return count;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void addItem(CartItem item) {
        for (int i = 0; i < count; i++) {
            if (items[i].getGoods().getId().equals(item.getGoods().getId())) {
                // 商品已存在，增加数量并更新总价
                items[i].setQuantity(items[i].getQuantity() + item.getQuantity());
                totalPrice += item.getGoods().getPrice() * item.getQuantity();
                return;
            }
        }
        // 商品不存在，添加到购物车
        items[count] = item;
        count++;
        totalPrice += item.getGoods().getPrice() * item.getQuantity();

    }

    public void removeItem(int i) {
        if (i >= 0 && i < count) {
            double removedPrice = items[i].getGoods().getPrice() * items[i].getQuantity();
            totalPrice -= removedPrice;
            for (int j = i; j < count - 1; j++) {
                items[j] = items[j + 1];
            }
            items[count - 1] = null;
            count--;
        }
    }

    public void setQuantity(int i, int quantity) {
        if (i >= 0 && i < count) {
            CartItem item = items[i];
            double price = item.getGoods().getPrice() * (quantity - item.getQuantity());
            totalPrice += price;
            item.setQuantity(quantity);
        }
    }

    @Override
    public String toString() {
        if (count == 0) {
            return userName + "的购物车是空的";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(userName).append("的购物车如下：\n");
        sb.append("id\t\t商品名\t\t单价\t\t\t数量\t\t\t总价\n");
        for (int i = 0; i < count; i++) {
            CartItem item = items[i];
            double itemTotalPrice = item.getGoods().getPrice() * item.getQuantity();
            sb.append(item.getGoods().getId()).append("\t\t").append(item.getGoods().getName()).append("\t\t")
                    .append(item.getGoods().getPrice()).append("\t\t")
                    .append(item.getQuantity()).append("\t\t\t")
                    .append(itemTotalPrice).append("\n");
        }
        sb.append("合计").append(totalPrice).append("\n");
        return sb.toString();
    }

    public void clearCart() {
        for (int i = 0; i < count; i++) {
            items[i] = null;
        }
        count = 0;
        totalPrice = 0.0;
    }
}