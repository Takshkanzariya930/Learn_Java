package practice;

class Employee
{
    String name;
    int age;
    int salary;
    int emp_no;

    static int count = 100;

    Employee(String name, int age, int salary)
    {
        this.name = name;
        this.age = age;
        this.salary = salary;
        count++;
        this.emp_no = count;
    }

    public void display()
    {
        System.out.println("Emp No. : "+emp_no + ", Name : "+name + ", Age : "+age + ", Salary : "+salary);
    }
}

public class Question9 
{
    public static void main(String[] args) 
    {
        Employee emp[] = new Employee[10];

        emp[0] = new Employee("A", 21, 20000);
        emp[1] = new Employee("B", 22, 22000);
        emp[2] = new Employee("C", 23, 24000);
        emp[3] = new Employee("D", 24, 26000);
        emp[4] = new Employee("E", 25, 28000);
        emp[5] = new Employee("F", 26, 30000);
        emp[6] = new Employee("G", 27, 32000);
        emp[7] = new Employee("H", 28, 34000);
        emp[8] = new Employee("I", 29, 36000);
        emp[9] = new Employee("J", 30, 38000);

        for(int i=0; i<10; i++)
        {
            emp[i].display();
        }
    }    
}
