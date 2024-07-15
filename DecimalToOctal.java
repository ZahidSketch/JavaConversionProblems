public class DecimalToOctal {

    static void toOctal(int num) {
        int[] arr = new int[100];
        int i = 0;
        while (num > 0) {
            arr[i++] = num % 8;
            num /= 8;
        }
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(arr[j]);
        }
    }
    public static void main(String[] args) {
        toOctal(10);
    }
}
