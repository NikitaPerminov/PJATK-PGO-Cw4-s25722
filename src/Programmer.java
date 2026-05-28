public class Programmer extends Employee{

    private String mainLanguage;
    private int numberOfRepositories;

    public Programmer(String idEmployee, String name, String lastName, double baseSalary, String mainLanguage, int numberOfRepositories) {
        super(idEmployee, name, lastName, baseSalary);
        this.mainLanguage = mainLanguage;
        this.numberOfRepositories = numberOfRepositories;
    }

    @Override
    public String toString() {
        return "Programmer : " +
                "numberOfRepositories=" + numberOfRepositories + '\'' +
                ", mainLanguage='" + mainLanguage;
    }

    @Override
    public double countCostPerMonth() {
        return super.countCostPerMonth() + getBaseSalary()/(numberOfRepositories*10);

    }

    @Override
    public String introduceYourself() {
        return super.introduceYourself()+ " and I program in " + mainLanguage;
    }

    public void printTechnologies(){
        System.out.println(getName() + " " + "and I program in " + mainLanguage);
    }

    public String getMainLanguage() {
        return mainLanguage;
    }

    public void setMainLanguage(String mainLanguage) {
        if (mainLanguage == null || mainLanguage.isEmpty()) {
            throw new IllegalArgumentException("Main language cannot be null");
        }
        this.mainLanguage = mainLanguage;
    }

    public int getNumberOfRepositories() {
        return numberOfRepositories;
    }

    public void setNumberOfRepositories(int numberOfRepositories) {
        if (numberOfRepositories <= 0) {
            throw new IllegalArgumentException("Number of repositories cannot be negative");
        }
        this.numberOfRepositories = numberOfRepositories;
    }
}
