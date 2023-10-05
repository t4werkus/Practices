public class Employee extends Person {
    private final int salary;
    private final int experience;
    private final String vacancy;

    private final String dream_company;
    private boolean alreadyWorking;


    @Override
    public void info() {
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("salary: " + salary);
        System.out.println("experience: " + experience);
        System.out.println("vacancy: " + vacancy);
        System.out.println("dream_company: " + dream_company);
        System.out.println("alreadyWorking: " + alreadyWorking);
    }

    public Employee(int salary, int experience, int age, String name, String vacancy, String dream_company, boolean alreadyWorking) {
        super(age, name);
        this.salary = salary;
        this.experience = experience;
        this.vacancy = vacancy;
        this.dream_company = dream_company;
        this.alreadyWorking = alreadyWorking;
    }
    public int getSalary() {
        return salary;
    }
    public int getExperience() {
        return experience;
    }
    public String getVacancy() {
        return vacancy;
    }
    public String getDream_company() {return dream_company;}
    public boolean isAlreadyWorking() {return alreadyWorking;}
    public void setAlreadyWorking(boolean alreadyWorking) {
        this.alreadyWorking = alreadyWorking;
    }
}
