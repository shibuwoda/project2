public class Goods {
    private String id;//商品的id
    private  String name;//商品名称
    private  double price;//单价

//            (2) 构造方法：3个参数，分别为3个成员变量赋初值

    public Goods(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

//            (3) 存取3个成员变量的get和set方法，

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
