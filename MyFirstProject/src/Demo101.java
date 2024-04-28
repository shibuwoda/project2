import java.util.Random;
public class Demo101 {
    public static void main(String[] args) {
        String[] flower = {"heart ", "spade ", "diamond ", "club "};
        String[] number = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] cards = new String[52];
        for (int i = 0; i < cards.length; i++) {
            cards[i] =   flower[i / 13] + number[i % 13];
        }
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            int index = random.nextInt(52 - i);
            String temp = cards[index];
            cards[index] = cards[51 - i];
            cards[51 - i] = temp;
        }
        System.out.println("随机抽取的四张牌：");
        for (int i = 0; i < 4; i++) {
            System.out.println(cards[51 - i]);
        }
    }
}

