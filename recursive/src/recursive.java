import java.util.Scanner;

public class recursive {
    public static void main(String[] args) {
 Scanner input= new Scanner(System.in);
        System.out.print("fibonacci sayınızı giriniz: ");
 int k= input.nextInt() ;
 for (int i=1;i<=k;i++)
        {
            System.out.println(i +"."+ "sayısı: " + fibonacci(i));
        }

    }
    static int fibonacci (int n)
    {
        if ((n==0) || (n==1))
        return n;

        else
           return fibonacci(n-1) + fibonacci(n-2);
    }
}

