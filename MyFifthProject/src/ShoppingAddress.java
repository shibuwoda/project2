public class ShoppingAddress {
    private String name;
    private String province;
    private String city;
    private String street;
    private String tel;

    public ShoppingAddress(String name, String province, String city, String street, String tel) {
        this.name = name;
        this.province = province;
        this.city = city;
        this.street = street;
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "收件人姓名: " + name + "\n省份: " + province + "\n城市: " + city + "\n街道: " + street + "\n联系电话: " + tel;
    }
}
