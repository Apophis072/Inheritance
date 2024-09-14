import java.util.ArrayList;

public class InheritanceDemo
{
    public static ArrayList<Worker> list = new ArrayList<>();
    public static int num;

    public static void main(String[] args)
    {

        Worker w1, w2, w3;
        SalaryWorker s1, s2, s3;

        w1 = new Worker("000001", "Bob", "Smith", "Mr.", 1986, 12.60);
        w2 = new Worker("000002", "Sally", "Simpson", "Mrs.", 1967, 23.30);
        w3 = new Worker("000003", "Abu", "Adams", "Mr.", 1950, 30.50);

        s1 = new SalaryWorker("000001", "Bobby", "Smiths", "Mr.", 1985, 15.60, 32448);
        s2 = new SalaryWorker("000002", "Sal", "Simpson", "Mrs.", 1965, 25.50, 51000);
        s3 = new SalaryWorker("000003", "Andy", "Adams", "Mr.", 1949, 32.50, 67600);

        list.add(w1);
        list.add(w2);
        list.add(w3);
        list.add(s1);
        list.add(s2);
        list.add(s3);

        for (Worker w : list)
        {
            num = 1;
            String weekNum = "Week " + num;
            String s = w.getFirstName() + ": ";
            System.out.println(weekNum + ":\n" + s);
            w.displayWeeklyPay(40);
            System.out.println("\n");
        }

        for (Worker w : list)
        {
            num = 2;
            String weekNum = "Week " + num;
            String s = w.getFirstName() + ": ";
            System.out.println(weekNum + ":\n" + s);
            w.displayWeeklyPay(50);
            System.out.println("\n");
        }

        for (Worker w : list)
        {
            num = 3;
            String weekNum = "Week " + num;
            String s = w.getFirstName() + ": ";
            System.out.println(weekNum + ":\n" + s);
            w.displayWeeklyPay(40);
            System.out.println("\n");
        }


    }
}
