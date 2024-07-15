public class IntToChar {
    public static void main(String[] args) {
        int n = 4;
//        char ch = (char)(n+'0');
//        System.out.println(ch);


        char ans = Character.forDigit(n, 10);
        System.out.println(ans);
    }
}
