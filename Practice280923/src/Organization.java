import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
public class Organization {
    private final String name;
    private final UUID id;
    private final HashMap<String, int[]> organization = new HashMap<>(); // 0) revAge 1) salary
    private final ArrayList<Employee> employees = new ArrayList<Employee>();
    private final ArrayList<Businesman> owners = new ArrayList<Businesman>();
    public Organization(String vacancy, int revAge, int salary, String name, UUID id) {
        this.name = name;
        this.id = id;
        organization.put(vacancy, new int[]{revAge, salary});
    }
    public void info() {
        System.out.println("Owners: ");
        for (Businesman businesman : owners) {
            System.out.print("\t");
            businesman.info();
        }
        System.out.println("vacancies:");
        for (Map.Entry<String, int[]> entry: organization.entrySet()) {
            System.out.println("\t" + entry.getKey() + ": \n" + "\t\trevAge: " + entry.getValue()[0] + "\n\t\tsalary: " +entry.getValue()[1]);
        }
        System.out.println("Employees:");
        for (Employee employee : employees) {
            employee.info();
        }
        System.out.println("id: " + id);
    }
    public void setRequirements(String vacancy, int[] requirement) {
        organization.put(vacancy, requirement);
    }
    public int[] getRequirements(String vacancy) {
        return organization.get(vacancy);
    }
    public String getName() {
        return name;
    }
    public void push_owner(Businesman newOwner) {
        owners.add(newOwner);
    }
    public void push_employee(Employee employee) {
        employees.add(employee);
    }
    public void del_vacancy(String vacancy) {
        organization.remove(vacancy);
    }
    public void interview_complited(Employee candicate) {
        push_employee(candicate);
        del_vacancy(candicate.getVacancy());
        candicate.setAlreadyWorking(true);
    }
    public void remove_organization(Businesman businesman, Organization tindex) {
        businesman.remove_organization(tindex);
        for (Employee i: employees) {
            i.setAlreadyWorking(false);
        }
        owners.clear();
        organization.clear();
        employees.clear();
    }
    public void dismissalOfAnEmployee(Employee employee) {
        employees.remove(employee);
        employee.setAlreadyWorking(false);
    }
    public void EmployeeResigns(Employee employee) {
        employees.remove(employee);
        employee.setAlreadyWorking(false);
    }
}
