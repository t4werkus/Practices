
public class Main {
    public static void main(String[] args) {
        Employee[] employeeArr = new Employee[5];
        employeeArr[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000.0, 30);
        employeeArr[1] = new Employee("Petrov Petr", "Manager", "petrov@mailbox.com", "892312312", 50000.0, 35);
        employeeArr[2] = new Employee("Sidorov Sergey", "Developer", "sidorov@mailbox.com", "892312312", 40000.0, 43);
        employeeArr[3] = new Employee("Kuznetsov Dmitry", "Designer", "kuznetsov@mailbox.com", "892312312", 35000.0, 28);
        employeeArr[4] = new Employee("Smirnov Alexey", "Analyst", "smirnov@mailbox.com", "892312312", 45000.0, 90);
        for (Employee i: employeeArr)
            if (i.getAge() > 40)
                i.getInfo();
    }
}