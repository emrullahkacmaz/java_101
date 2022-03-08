public class Main {
    public static void main(String[] args) {

        Course mat= new Course("matematik", "mat-101",85);
        Course fizik=new Course("fizik","fizik-101",65);
        Course kimya=new Course("kimya", "kimya-101",56);


        double[] notlar={mat.note, fizik.note, kimya.note};
        Calculate.calcAverage(notlar);

    }
}
