package Card2;

public class Card implements Comparable<Card>{
    private String color; // 花色
    private String displayNumber; // 显示的文字
    private int number; // 实际的数字大小

    // 构造方法
    public Card(String color, String displayNumber) {
        this.color = color;
        this.displayNumber = displayNumber;
        this.number = calculateNumber(displayNumber);
    }

    // get和set方法
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDisplayNumber() {
        return displayNumber;
    }

    public void setDisplayNumber(String displayNumber) {
        this.displayNumber = displayNumber;
        this.number = calculateNumber(displayNumber);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    // 辅助方法，用于根据显示的文字计算实际的数字大小
    private int calculateNumber(String displayNumber) {
        switch (displayNumber) {
            case "J":
                return 11;
            case "Q":
                return 12;
            case "K":
                return 13;
            case "A":
                return 14;
            case "2":
                return 15;
            default:
                return Integer.parseInt(displayNumber);
        }
    }

    @Override
    public String toString() {
        return color + displayNumber;
    }

    @Override
    public boolean equals(Object o) {
        boolean flag = false;
        if(o instanceof Card){
            Card c = (Card) o;
            if(c.displayNumber.equals(this.displayNumber)&& c.color.equals(this.color)){
                flag = true;
            }
        }
        return flag;
    }

    @Override
    public int compareTo(Card c) {
        // 首先比较点数，点数相同则再比较花色
        int result = Integer.compare(this.number,c.getNumber());
        result = result==0?(this.getColor().compareTo(c.getColor())):result;
        return result;

    }
}

