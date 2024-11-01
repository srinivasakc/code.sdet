public class Reverse_Numbers {
    public static  void main(String[] args) {
        System.out.println(reverse_Numbers(3345678));
    }
    public static int reverse_Numbers(int nums){
        int reversed =0;

        while(nums>0){
           int rem=nums%10;
           reversed=reversed*10+rem;
           nums=nums/10;
        }

        return reversed;

    }
}
