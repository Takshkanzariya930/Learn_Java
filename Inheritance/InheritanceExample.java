class Employee
{
    float salary = 40000;
}

class Programmer extends Employee
{
    float bonus = 10000;
}

class InheritanceExample
{
    public static void main(String[] args)
    {
        Programmer p = new Programmer();
        System.out.println("Employees salary is "+p.salary);
        System.out.println("Programmer bonus is "+p.bonus);
    }
}