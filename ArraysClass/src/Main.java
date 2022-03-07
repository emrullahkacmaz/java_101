import  java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        int[] dizi={2,6,5,752,8,888};
        System.out.println(Arrays.toString(dizi));

         //---------------
          Arrays.fill(dizi,5);
        System.out.println(Arrays.toString(dizi));

        //-------------
        int[] dizi2={2,16,54,752,8,888};

        Arrays.sort(dizi2);
        System.out.println(Arrays.toString(dizi2));

        //----------------
        int[] dizi3={2,16,54,752,8,888};
        int index= Arrays.binarySearch(dizi3, 8);
        System.out.println(index +". index :8");

        //------------
        int [] dizi4 = Arrays.copyOfRange(dizi3, 2,5);
        System.out.println(Arrays.toString(dizi4));

        System.out.println(Arrays.equals(dizi2, dizi3));

    HelperArray.print(dizi4);


    }
}
