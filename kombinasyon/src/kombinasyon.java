import java.util.Scanner;
public class kombinasyon {
    public static void main(String[] args) {
        Scanner n= new Scanner(System.in);
        Scanner r= new Scanner(System.in);
        System.out.print("first number: ");
        int first =n.nextInt();
        System.out.print("second number: ");
        int second= r.nextInt();

        int total1 =1;
        int total2=1;
        int total4=1;
        int total3;

        for(int i=1;i<=first;i++)
        {
            total1=total1*i;
        }
        for (int j=1; j<=first-second;j++)
        {
            total2=total2*j;
        }
        for (int k=1; k<=second;k++) {
            total4=total4*k;
        }
        total3= total1/(total2*total4);
        System.out.println("kombinasyon: "+ total3);

    }
}
