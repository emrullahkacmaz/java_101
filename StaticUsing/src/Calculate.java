public class Calculate {

    public static void calcAverage(double[] note)
    {
        int total=0;

        for(int i=0;i<note.length;i++)
        {
            total+=note[i];
        }
        double average=total/ note.length;
        System.out.println("ortalama: "+ average);
    }
}
