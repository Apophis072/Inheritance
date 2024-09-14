public class SalaryWorker extends Worker
{

    private double annualSalary;

    public SalaryWorker(String ID, String firstName, String lastName, String title, int birthYear, double hourlyPayRate, double annualSalary)
    {
        super(ID, firstName, lastName, title, birthYear, hourlyPayRate);
        this.annualSalary = annualSalary;
    }

    public double calculateWeeklyPay(double hoursWorked)
    {
        getAnnualSalary();
        double weeklyPay = annualSalary / 52;
        return weeklyPay;
    }

    @Override
    public void displayWeeklyPay(double hoursWorked) {
        super.displayWeeklyPay(hoursWorked);
    }

    public double getAnnualSalary()
    {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary)
    {
        this.annualSalary = annualSalary;
    }

    @Override
    public String toJSONRecord() {
        return super.toJSONRecord() +
                "annualSalary" + ":" + annualSalary + "}";
    }

    @Override
    public String toXMLRecord() {
        return super.toXMLRecord() +
                "<annualSalary>" + annualSalary + "<annualSalary></SalaryWorker>";
    }

    @Override
    public String toCSVRecord() {
        return super.toCSVRecord() +
                "," + annualSalary;
    }
}
