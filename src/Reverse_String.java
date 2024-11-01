public class Reverse_String {
    public static void main(String[] args) {

        System.out.println(reverse_String("Reservation"));// output: "noitavreseR"
    }
    public static String reverse_String(String str) {
        String rev="";
        int len = str.length();

        for(int i=len-1;i>=0;i--){
            rev = rev+str.charAt(i);
        }
        return rev;
    }
}