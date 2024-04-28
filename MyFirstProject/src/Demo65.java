import java.util.Random;
public class Demo65 {
    public static void main(String[] args) {
                String[] kinds = {"Spades", "Hearts", "Clubs", "Diamonds"};
                String[] numbers = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
                Random random = new Random();
                String randomKind = kinds[random.nextInt(kinds.length)];
                String randomNumber = numbers[random.nextInt(numbers.length)];
                System.out.println("Card: " + randomKind+randomNumber);

    }
}
