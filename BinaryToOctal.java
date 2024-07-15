public class BinaryToOctal {

    static int toDecimal(long binary){
        int decimal = 0;
        int i =0;
        while(binary>0){
            decimal += Math.pow(2,i++) * (binary%10);
            binary = binary/10;
        }
        return decimal;
    }

    static int toOctal(long binary) {
        int decimal = toDecimal(binary);
        String octal = Integer.toOctalString(decimal);
        return Integer.parseInt(octal);
    }
    public static void main(String[] args) {
        System.out.println(toOctal(1001011));
    }
}
