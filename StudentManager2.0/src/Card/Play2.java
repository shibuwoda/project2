package Card;

import java.util.*;

public class Play2 {
    private static final String[] COLORS = {"黑桃", "红桃", "梅花", "方块"};
    // 扑克牌的点数
    private static final String[] NUMBERS = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

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
            // 创建一个HashMap来存储玩家和他们的牌
            Map<String, List<Card>> players = new HashMap<>();
            for (int i = 0; i < 4; i++) {
                String playerName = "player" + (i + 1);//玩家名
                players.put(playerName, new ArrayList<>()); // 初始化玩家的牌列表
            }

            // 将牌分配给玩家
            int playerIndex = 0;
            for (Card card : cardList) {
                String playerName = "player" + ((playerIndex % 4) + 1); // 根据索引获取玩家名称
                players.get(playerName).add(card); // 将牌添加到对应玩家的列表中
                playerIndex++;
            }
//            排序
            for (List<Card> cards : players.values()) {
                Collections.sort(cards); // 使用Card类中实现的compareTo进行排序
            }

            // 遍历输出每个玩家及其手上的牌
            for (Map.Entry<String, List<Card>> entry : players.entrySet()) {
                String playerName = entry.getKey();
                List<Card> playerCards = entry.getValue();
                System.out.println(playerName + " 的牌:");
                for (Card card : playerCards) {
                    System.out.println(card); // 输出每张牌的信息
                }
            }
    }
}