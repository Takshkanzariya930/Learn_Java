package innerclass;

// write a program which has two classes Outer and Inner class. Outer class has student information while the Inner class has their roll no. create multiple methods to show case functionality of outer class and inner class.

class StudentInfo
{
    String name;
    int year;
    String branch;
    RollClass roll;

    StudentInfo(int roll, String name, int year, String branch)
    {
        this.roll = new RollClass(roll);
        this.name = name;
        this.year = year;
        this.branch = branch;
    }

    private class RollClass
    {
        int en_no;

        RollClass(int roll)
        {
            en_no = roll;
        }

        void print_en_no()
        {
            System.out.println("Enrollment No. : "+en_no);
        }
    }

    void display_student_info()
    {
        this.roll.print_en_no();
        System.out.println("Name : "+name);
        System.out.println("Year : "+year);
        System.out.println("Branch : "+branch);
        System.out.println();
    }

}

class InnerClassExampleQ
{
    public static void main(String[] args)
    {
        StudentInfo std1 = new StudentInfo(101, "Abc", 3, "CE");
        StudentInfo std2 = new StudentInfo(102, "Cde", 2, "AI");
        StudentInfo std3 = new StudentInfo(103, "Efg", 1, "IT");
        StudentInfo std4 = new StudentInfo(104, "Ghi", 3, "EC");

        std1.display_student_info();
        std2.display_student_info();
        std3.display_student_info();
        std4.display_student_info();


    }
}