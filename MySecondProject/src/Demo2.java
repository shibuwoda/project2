import java.util.*;

class Poker implements Comparable<Poker>{
    /**
     * 定义属性
     */
    private String pokerColor;//花色
    private String pokerNumber;//数字
    private int pokerColorValue;//花色值
    private int pokerNumberValue;//数字值

    /**
     *无参和有参构造
     */
    public Poker(){

    }

    public Poker(String pokerColor, String pokerNumber, int pokerColorValue, int pokerNumberValue) {
        this.pokerColor = pokerColor;
        this.pokerNumber = pokerNumber;
        this.pokerColorValue = pokerColorValue;
        this.pokerNumberValue = pokerNumberValue;
    }

    /**
     *Setter and Getter
     */

    public String getPokerColor() {
        return pokerColor;
    }

    public void setPokerColor(String pokerColor) {
        this.pokerColor = pokerColor;
    }

    public String getPokerNumber() {
        return pokerNumber;
    }

    public void setPokerNumber(String pokerNumber) {
        this.pokerNumber = pokerNumber;
    }

    public int getPokerColorValue() {
        return pokerColorValue;
    }

    public void setPokerColorValue(int pokerColorValue) {
        this.pokerColorValue = pokerColorValue;
    }

    public int getPokerNumberValue() {
        return pokerNumberValue;
    }

    public void setPokerNumberValue(int pokerNumberValue) {
        this.pokerNumberValue = pokerNumberValue;
    }

    @Override
    public String toString() {
        return "Poker{" +
                "pokerColor='" + pokerColor + '\'' +
                ", pokerNumber='" + pokerNumber + '\'' +
                ", pokerColorValue=" + pokerColorValue +
                ", pokerNumberValue=" + pokerNumberValue +
                '}'+"\n";
    }

    @Override
    public int compareTo(Poker o) {
        int sum=this.pokerColorValue-o.pokerColorValue;
        return sum;
    }
}
class Pokers{
    private int count=52;
    private List<Poker> pokers=new ArrayList<>();

    public Pokers(int count) {
        this.count = count;
        for (int i=1;i<=4;i++){
            for (int j=3;j<=15;j++){
                Poker p = new Poker();
                p.setPokerColorValue(i);
                p.setPokerNumberValue(j);
                setColor(i,p);
                setNumber(j,p);
                pokers.add(p);


            }
        }
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Poker> getPokers() {
        return pokers;
    }

    public void setPokers(List<Poker> pokers) {
        this.pokers = pokers;
    }

    public  void setColor(int pokerColorValue, Poker p){
        switch (pokerColorValue){
            case 1:
                p.setPokerColor("Spade");
                break;
            case 2:
                p.setPokerColor("Heart");
                break;
            case 3:
                p.setPokerColor("Club");
                break;
            case 4:
                p.setPokerColor("Diamond");
                break;
        }
    }
    public  void setNumber(int pokerNumberValue,Poker p){
        switch (pokerNumberValue){
            case 11:
                p.setPokerNumber("J");
                break;
            case 12:
                p.setPokerNumber("Q");
                break;
            case 13:
                p.setPokerNumber("K");
                break;
            case 14:
                p.setPokerNumber("A");
                break;
            case 15:
                p.setPokerNumber("2");
                break;
            default:
                p.setPokerNumber(""+pokerNumberValue);
                break;
        }
    }


}

public class Demo2 {
    public static void main(String[] args) {
        Pokers pokers=new Pokers(52);
        List<Poker>pokers1=pokers.getPokers();
        System.out.println(pokers1);


    }

}
