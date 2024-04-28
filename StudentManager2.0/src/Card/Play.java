package Card;

import java.util.*;

public class Play {
    // 扑克牌的花色
    private static final String[] COLORS = { "黑桃", "红桃", "梅花", "方块" };
    // 扑克牌的点数
    private static final String[] NUMBERS = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

    public static void main(String[] args) {
        // （1）创建ArrayList对象cardList，向其中放入代表52张牌的Card对象
        ArrayList<Card> cardList = new ArrayList<>();
        for (String color : COLORS) {
            for (String number : NUMBERS) {
                cardList.add(new Card(color, number));
            }
        }

        // （2）将cardList乱序
        Collections.shuffle(cardList);

        // （3）把乱序的52张牌分给4个玩家，每人13张（分成4个list）
        ArrayList<ArrayList<Card>> players = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            players.add(new ArrayList<>());
        }


        int playerIndex = 0;
        for (Card card : cardList) {
            players.get(playerIndex).add(card);
            playerIndex = (playerIndex + 1) % 4; // 循环分配牌给每个玩家
        }

        // （4）每个玩家的牌按照从小到大进行排序
        for (List<Card> player : players) {
            Collections.sort(player, new Comparator<Card>(){
                @Override
                public int compare(Card o1, Card o2) {
                    int result = o1.getNumber() - o2.getNumber();
                    result = result==0?(o1.getColor().compareTo(o2.getColor())):result;
                    return result;
                }

            });
        }
        // （5）输出每个玩家的牌
        int playerNumber = 1;
        for (List<Card> player : players) {
            System.out.println("玩家" + playerNumber + "的牌：");
            for (Card card : player) {
                System.out.print(card + " ");
            }
            System.out.println();
            playerNumber++;
        }
    }
}