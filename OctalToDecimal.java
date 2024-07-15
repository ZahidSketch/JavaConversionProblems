public class OctalToDecimal {

    static int toDecimal(long octal) {
        int decimal = 0;
        int i = 0;
        while(octal > 0) {
            decimal += Math.pow(8,i++)*(octal % 10);
            octal /= 10;
        }
        return decimal;
    }
    public static void main(String[] args) {
        System.out.println(toDecimal(10));
    }
}
