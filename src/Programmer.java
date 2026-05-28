public class Programmer extends Employee{

    private String mainLanguage;
    private int numberOfRepositores;

    public Programmer(String idEmployee, String name, String lastName, double baseSalary) {
        super(idEmployee, name, lastName, baseSalary);
        this.setMainLanguage(mainLanguage);
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "numberOfRepositores=" + numberOfRepositores +
                '}';
    }

    @Override
    public double countCostPerMonth() {
        return super.countCostPerMonth() + getBaseSalary()/(numberOfRepositores*10);

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
}
