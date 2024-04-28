public class Demo108 {

        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 2, 3, 5, 1};
            int[] result = removeDuplicates(arr);

            System.out.println("去重后的数组：");
            for (int num : result) {
                System.out.print(num + " ");
            }
        }

        public static int[] removeDuplicates(int[] arr) {
            int[] uniqueArr = new int[arr.length];
            int index = 0;

            for (int i = 0; i < arr.length; i++) {
                boolean isDuplicate = false;

                for (int j = 0; j < index; j++) {
                    if (arr[i] == uniqueArr[j]) {
                        isDuplicate = true;
                        break;
                    }
                }

                if (!isDuplicate) {
                    uniqueArr[index++] = arr[i];
                }
            }

            int[] result = new int[index];
            System.arraycopy(uniqueArr, 0, result, 0, index);

            return result;
        }


}
