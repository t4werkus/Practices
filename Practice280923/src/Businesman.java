import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;

public class Businesman extends Person{
    private final ArrayList<Organization> organizations = new ArrayList<Organization>();
    Businesman(int newAge, String newName) {
        super(newAge, newName);
    }
    public boolean interview(Employee candicate, Organization tindex) {
        if ((tindex.getRequirements(candicate.getVacancy()) != null)) {
            return candicate.getExperience() >= tindex.getRequirements(candicate.getVacancy())[0] && candicate.getSalary() <= tindex.getRequirements(candicate.getVacancy())[1] && tindex.getName().equals(candicate.getDream_company());
        }
        return false;
    }
    public void setOrganization(Organization tindex) {
        organizations.add(tindex);
    }
    @Override
    public void info() {
        System.out.println(name);
        System.out.println(age);
        if (!organizations.isEmpty())
            System.out.println(Arrays.toString(new ArrayList[]{organizations}));
        else
            System.out.println("empty");
    }
    public void remove_organization(Organization organization) {
        organizations.remove(organization);
    }
    public void getName() {
        System.out.println(name);
    }
    public void createOrganization(Businesman owner, String vacancy, int revAge, int salary, String name) {
        Organization organization = new Organization(vacancy, revAge, salary, name, UUID.randomUUID());
        organization.push_owner(owner);
        owner.setOrganization(organization);
    }

}
