package practice;

class Student
{
    int StdId;
    String StdName;
    int StdMarks;

    Student(int id, String name, int marks)
    {
        StdId = id;
        StdName = name;
        StdMarks = marks;
    }

    public void showResult()
    {
        if (StdMarks > 40)
        {
            System.out.println("Pass");
        }
        else
        {
            System.out.println("Fail");
        }
    }

    public void display()
    {
        System.out.println("ID : " + StdId);
        System.out.println("Name : " + StdName);
        System.out.println("Marks : " + StdMarks);        
    }
}

class Question1 
{
    public static void main(String[] args) {
        Student st = new Student(101, "Joe", 57);

        st.display();
        st.showResult();
    }
}