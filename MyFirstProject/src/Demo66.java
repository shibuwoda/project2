import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 随机52张
 * 打印出13张不重复
 * 排序花色数字
 */
class Poker{
    private String cardColor;//花色
    private int cardColorValue;//花色值
    private String cardNumber;//数字
    private int cardNumberValue;//数字值

    /**
     * 无参构造
     */

    public Poker(){

    }

    /**
     *有参
     */
    public Poker(String cardColor, int cardColorValue, String cardNumber, int cardNumberValue) {
        this.cardColor = cardColor;
        this.cardColorValue = cardColorValue;
        this.cardNumber = cardNumber;
        this.cardNumberValue = cardNumberValue;
    }

    /**
     *Setter and Getter
     */
    public String getCardColor() {
        return cardColor;
    }

    public void setCardColor(String cardColor) {
        this.cardColor = cardColor;
    }

    public int getCardColorValue() {
        return cardColorValue;
    }

    public void setCardColorValue(int cardColorValue) {
        this.cardColorValue = cardColorValue;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCardNumberValue() {
        return cardNumberValue;
    }

    public void setCardNumberValue(int cardNumberValue) {
        this.cardNumberValue = cardNumberValue;
    }

    @Override
    public String toString() {
        return "Poker{" +
                "cardColor='" + cardColor + '\'' +
                // ", cardColorValue=" + cardColorValue +
                ", cardNumber='" + cardNumber + '\'' +
                // ", cardNumberValue=" + cardNumberValue +
                '}'+"\n";
    }
}
class Pokers{
    private int count=52;//总数52张
    private List<Poker>pokers=new ArrayList<>();

    public Pokers(int count) {
        this.count = count;

        for(int i=1;i<=4;i++){
            for (int j=3;j<=15;j++){
                Poker p=new Poker();
                p.setCardColorValue(i);//设置花色值
                p.setCardNumberValue(j);//设置数字值
                setColor(i,p);//花色转化
                setNumber(j,p);//数字转化
                pokers.add(p);//装入集合
            }
        }
    }

    /**
     * 洗牌方法
     */
    public void shufflePoker(){
        Collections.shuffle(pokers);

    }
    /**
     * 排序方法
     */

    public void orderPoker(){
        List<Poker> player1 = pokers.subList(0, 13);//获取前十三个元素
        //花色排序
        Collections.sort(player1, (poker1, poker2) -> poker1.getCardColorValue() - poker2.getCardColorValue());
        // Collections.sort(pokers13, (poker1, poker2) -> poker1.getCardNumberValue() - poker2.getCardNumberValue());

        System.out.println(player1);
        List<Poker> player2 = pokers.subList(13, 26);
        Collections.sort(player2, (poker1, poker2) -> poker1.getCardColorValue() - poker2.getCardColorValue());
        System.out.println(player2);
        List<Poker> player3 = pokers.subList(26, 39);
        Collections.sort(player3, (poker1, poker2) -> poker1.getCardColorValue() - poker2.getCardColorValue());
        System.out.println(player3);
        List<Poker> player4 = pokers.subList(39, 52);
        Collections.sort(player4, (poker1, poker2) -> poker1.getCardColorValue() - poker2.getCardColorValue());
        System.out.println(player4);


    }

    /**
     *设置花色的方法
     * 黑桃spade,红桃heart,方片diamond,梅花club
     */
    public static void setColor(int cardColorValue,Poker p){
        switch (cardColorValue){
            case 1:
                p.setCardColor("Spade");
                break;
            case 2:
                p.setCardColor("Heart");
                break;
            case 3:
                p.setCardColor("Club");
                break;
            case 4:
                p.setCardColor("Diamond");
                break;
        }
    }

    /**
     *设置牌数值
     */
    public static void setNumber(int cardNumberValue,Poker p) {
        switch (cardNumberValue){
            case 11:
                p.setCardNumber("J");
                break;
            case 12:
                p.setCardNumber("Q");
                break;
            case 13:
                p.setCardNumber("K");
                break;
            case 14:
                p.setCardNumber("A");
                break;
            case 15:
                p.setCardNumber("2");
                break;
            default:
                p.setCardNumber(""+cardNumberValue);
                break;
        }
    }

    /**
     *Setter and Getter
     */
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
}
public class Demo66 {
    public static void main(String[] args) {
        Pokers pokers=new Pokers(52);
       // List<Poker> pokers1=pokers.getPokers();//获得集合
        pokers.shufflePoker();//洗牌
        pokers.orderPoker();//排序方法

    }
}
