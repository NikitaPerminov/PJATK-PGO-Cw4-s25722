public class Main {
    public static void main(String[] args) {

        ProjectTeam team = new ProjectTeam("Campus App");

        Employee employee1 = new Programmer("E-101", "Anna", "Maj", 12000.0, "Java", 4);
        Employee employee2 = new Tester("E-201", "Piotr", "Lis", 9800.0, true, 25);
        Employee employee3 = new Programmer("E-102", "Karol", "Wojcik", 11500.0, "Kotlin", 3);

        team.addEmployee(employee1);
        team.addEmployee(employee2);
        team.addEmployee(employee3);

        team.printTeamMembers();
        System.out.println("Total team cost: " + team.calculateTotalCost());

        System.out.println(employee1.introduceYourself());
        System.out.println(employee2.introduceYourself());

        if (employee1 instanceof Programmer) {
            Programmer programmer = (Programmer) employee1;
            programmer.printTechnologies();
        }

        System.out.println(employee2.equals(new Tester("E-201", "Other", "Data", 9000.0, false, 10)));
        System.out.println(employee2);

    }
}