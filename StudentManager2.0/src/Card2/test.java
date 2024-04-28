package Card2;

import java.util.*;

public class test {
    public static void main(String[] args) {
        Map<String, List<Card>> map = new HashMap<>();
        List<Card> playerOne = new ArrayList<>();
        playerOne.add(new Card("红桃","10"));
        playerOne.add(new Card("黑桃","Q"));
        playerOne.add(new Card("方块","2"));
        playerOne.add(new Card("梅花","J"));
        map.put("playerOne",playerOne);
        Set<String> keySet = map.keySet();
        Iterator<String> i = keySet.iterator();
        while (i.hasNext()){
            String key = i.next();
            System.out.println(map.get(key));
        }
    }
}
