public class Tester extends  Employee{

    private boolean isAutomated;
    private int numberOfScenarios;


    public Tester(String idEmployee, String name, String lastName, double baseSalary, boolean isAutomated, int numberOfScenarios) {
        super(idEmployee, name, lastName, baseSalary);
        this.isAutomated = isAutomated;
        this.numberOfScenarios = numberOfScenarios;
    }

    @Override
    public double countCostPerMonth() {
        return super.countCostPerMonth() + getBaseSalary()/(numberOfScenarios*15);
    }

    @Override
    public String introduceYourself() {
        return super.introduceYourself() + " and I test " + numberOfScenarios + " scenarios";
    }

    public void runReportOfTests(){
        System.out.println("Running report of" + numberOfScenarios + " scenarios" );
    }


    public boolean isAutomated() {
        return isAutomated;
    }

    public void setAutomated(boolean automated) {
        isAutomated = automated;
    }

    public int getNumberOfScenarios() {
        return numberOfScenarios;
    }

    public void setNumberOfScenarios(int numberOfScenarios) {
        if (numberOfScenarios <= 0) {
            throw new IllegalArgumentException("Number of scenarios cannot be negative");
        }
        this.numberOfScenarios = numberOfScenarios;
    }
}
