class Student
{
    String name;
    int age;
    public void printInfo()
    {
        System.out.println(this.name);
        System.out.println(this.age);
      
    }

    Student(String name, int age)
    {
        this.name = name;
        this.age=age;
        // System.out.println("I am Constructor");
    }
}

public class Demo2
{
    public static void main(String args[])
    {
        Student s1 = new Student("neeraj",24);
        // s1.name="Neeraj";
        // s1.age=25;
        s1.printInfo();
    }
}

