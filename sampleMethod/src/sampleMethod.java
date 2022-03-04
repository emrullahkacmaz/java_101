import java.util.Scanner;

public class sampleMethod {
   static  void helloworld(){
       System.out.println("şampiyon beşiktaş");
   }
    static int power(int base, int exp) {
        int result=1;
        for (int i=1;i<=exp;i++) {
            result*= base;
        }
        return result;
    }
    public static void main(String[] args) {


        int case1= power(4,3);
        System.out.println(case1);
        System.out.println(power(2,5));
        helloworld();
    }
}
