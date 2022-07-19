// 1.Create a class named Student with String variable name and integer variable roll_no. Assign the value
//of roll_no as 2 and that of name as John by creating an object of the class Student

public class Student{
    String name;
    int roll_no;

    public void DisplayInfo()
    {
        System.out.println("My name is" + " "+ name);
        System.out.println("My Roll Number is" + " "+ roll_no);
    }
}

public class Demo
{
    public static void main(String[] args)
    {
            Student st1;
            st1 = new Student();

            st1.name="John";
            st1.roll_no=2;

            st1.DisplayInfo();

    }       
}

