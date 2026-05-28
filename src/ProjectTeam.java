import java.util.ArrayList;

public class ProjectTeam  {

    private String ProjectName;
    private ArrayList<Employee> employees = new ArrayList<>();


    public ProjectTeam(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    public String getProjectName() {
        return ProjectName;
    }

    public void setProjectName(String projectName) {
        if (projectName == null || projectName.isEmpty()) {
            throw new IllegalArgumentException("Project name cannot be null");
        }
        ProjectName = projectName;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public double calculateTotalCost(){
        double totalCost = 0;
        for(Employee employee : employees){
            totalCost += employee.countCostPerMonth();
        }

        return totalCost;
    }

    public void findById (String Id){
        for(Employee employee : employees){
            if(employee.getIdEmployee().equals(Id)){
                //System.out.println(employee.introduceYourself());
            }
        }
    }

    public void printTeamMembers(){
        for(Employee employee : employees){
            System.out.println(employee.introduceYourself());
        }
    }
}
