public class Demo41 {
        public static void main(String[] args) {
            String input = "Hello, World!";
            String reversed = reverseString(input);
            System.out.println(reversed);
        }

        public static String reverseString(String input) {
            StringBuilder reversed = new StringBuilder();
            for (int i = input.length() - 1; i >= 0; i--) {
                reversed.append(input.charAt(i));
            }
            return reversed.toString();
        }




}
