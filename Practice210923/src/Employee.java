public class Employee {
    private final String name;
    private final String job_title;
    private final String email;
    private final String phoneNumber;
    private final double salary;
    private final int age;

    public Employee(String _name, String _job_title, String _email, String _phoneNumber, double _salary, int _age) {
        name = _name;
        job_title = _job_title;
        email = _email;
        phoneNumber = _phoneNumber;
        salary = _salary;
        age = _age;

    }
    public int getAge() {
        return age;
    }
    public void getInfo() {
        System.out.println("name: " + name + "\n" +
                "job title: " + job_title + "\n" +
                "email: " + email + "\n" +
                "phoneNumber: " + phoneNumber + "\n" +
                "salary: " + salary + '\n' +
                "age: " + age + '\n');
    }

}
