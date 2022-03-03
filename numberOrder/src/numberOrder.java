import java.util.Scanner;
public class numberOrder {
    public static void main(String[] args) {
        int temp;
        int x;
        Scanner input= new Scanner(System.in);

        System.out.print("array uzunluğunu belirleyiniz :");
        x= input.nextInt();

        int a[] = new int[x];
        Scanner r= new Scanner(System.in);
        System.out.println("sayıları giriniz");
        for (int i=0; i<a.length;i++)
        {
            a[i]= r.nextInt();
        }
        for (int i=0;i<a.length;i++)
        {
            for (int j=i+1;j<a.length;j++)
            {
                if (a[i]<a[j])
                {
                    temp= a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for (int i=0; i<a.length;i++)
        {
            System.out.println(a[i]);
        }

    }
}
