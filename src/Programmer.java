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
        return "Programmer{" +
                "numberOfRepositores=" + numberOfRepositories +
                '}';
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
        System.out.println("I program in " + mainLanguage);
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

    public int getNumberOfRepositores() {
        return numberOfRepositories;
    }

    public void setNumberOfRepositores(int numberOfRepositores) {
        if (numberOfRepositores <= 0) {
            throw new IllegalArgumentException("Number of repositores cannot be negative");
        }
        this.numberOfRepositories = numberOfRepositores;
    }
}
