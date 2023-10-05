import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Employee mike = new Employee(100000, 10, 30, "Mike", "HR", "google", false);
        Employee agor = new Employee(120000, 7, 25, "Agor",  "HR", "d", false);
        Employee stas = new Employee(104000, 20, 40, "Stas",  "Middle C++ developer", "d", false);
        Employee hank = new Employee(40000, 1, 20, "Hank", "Middle JS developer", "d", false);
        Employee egor = new Employee(500000, 6, 28, "Egor", "Data-engineer", "d", false);
        Organization google = new Organization("Middle C++ developer", 5, 100000, "google", UUID.randomUUID());
        google.setRequirements("HR", new int[]{2, 500000});
        Businesman andy = new Businesman(50, "Andy");
        google.push_owner(andy);
        if (andy.interview(mike, google)) {
            google.interview_complited(mike);
        }
        //mike.info();
        google.info();
        google.remove_organization(andy, google);
        //google.info();
        //andy.info();
    }
}