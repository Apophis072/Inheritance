public class Worker extends Person
{
    private double hourlyPayRate;
    private double totalPay = 0;
    private double regularPay = 0;
    private int hoursWorked;
    private double extraPay = 0;

    public Worker(String ID, String firstName, String lastName, String title, int birthYear, double hourlyPayRate)
    {
        super(ID, firstName, lastName, title, birthYear);
        this.hourlyPayRate = hourlyPayRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getTotalPay() {
        return totalPay;
    }

    public void setTotalPay(double totalPay) {
        this.totalPay = totalPay;
    }

    public double getRegularPay() {
        return regularPay;
    }

    public void setRegularPay(double regularPay) {
        this.regularPay = regularPay;
    }

    public double calculateWeeklyPay(double hoursWorked)
    {

        hoursWorked = getHoursWorked();
        hourlyPayRate = getHourlyPayRate();
        if (hoursWorked < 40 && hoursWorked > 0)
        {
         totalPay = hoursWorked * hourlyPayRate;
        }
        else
        {
             regularPay = 40 * hourlyPayRate;
            totalPay = regularPay + ((hoursWorked-40)*1.5*hourlyPayRate);
        }

        return totalPay;
    }
    public void displayWeeklyPay(double hoursWorked)
    {
        double extraHour = hoursWorked - 40;
        if (hoursWorked > 40)
        {
            regularPay = 40 * hourlyPayRate;
            extraPay = (hoursWorked - 40) * 1.5 * hourlyPayRate;
            totalPay = regularPay + extraPay;
            System.out.println("You got 40 hours of regular pay. Which amounts to " + regularPay + " . You also got " + extraHour
                    + " hours of overtime pay. Which amounts to " + extraPay + ". This results in a total payment of " + totalPay + ".");
        }
        else if (hoursWorked <= 40 && hoursWorked > 0)
        {
            regularPay = hoursWorked * hourlyPayRate;
            System.out.println("You got " + hoursWorked + " hours of regular pay. Which amounts to " + regularPay + ".");
        }
    }

    @Override
    public String toCSVRecord() {
        return super.toCSVRecord() +
                "," + hourlyPayRate;
    }

    @Override
    public String toXMLRecord() {
        return super.toXMLRecord() +
                "<HourlyPayRate>" + hourlyPayRate + "<HourlyPayRate></Worker>";
    }

    @Override
    public String toJSONRecord() {
        return super.toJSONRecord() +
                "HourlyPayRate"  +  ":" + hourlyPayRate + "}";
    }
}
