import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Demo97 {
    public static void main(String[] args) {
        List<Integer> prizes = new ArrayList<>();//新建一个数组
        prizes.add(28);//加入元素
        prizes.add(68);
        prizes.add(98);
        prizes.add(648);
        prizes.add(888);

        Random random = new Random();
        //抽了不放回，抽空即止
        while (!prizes.isEmpty()) {
            int index = random.nextInt(prizes.size());
            int prize = prizes.remove(index);//去除该元素
            System.out.println("抽中奖项：" + prize);
        }
    }
}

