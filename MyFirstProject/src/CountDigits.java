import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner =new Scanner(System.in);
        String string = scanner.nextLine();
        for (int i = 0;i<string.length();i++){
            char c= string.charAt(i);
            if(c>='0'&&c<='9'){
                count++;
            }
        }
        System.out.println(count);
    }
}

