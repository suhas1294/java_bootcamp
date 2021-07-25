package _01_basics;

class Student{
    int id;
    String name;
}

public class TestStudent{
    
    // parameter : the one function has
    // argument : the ones sent to function while calling

    static void someMethod(Student student){
        student = new Student();
        student.id = 100;
        student.name = "Doe";
    }

    static void someOtherMethod(Student student){
        student.id = 89;
        student.name = "Foobar";
    }

    public static void main(String[] args){
        System.out.println("this is aw");
        // example-1
        Student s1 = new Student();
        s1.id = 23;
        s1.name = "John";

        System.out.println("before calling someMethod\t" + s1.name); // john
        someMethod(s1);
        System.out.println("after calling someMethod\t" + s1.name + "\n"); // doe

        // example-2
        Student s2 = new Student();
        s2.id = 23;
        s2.name = "William";
        
        System.out.println("before calling someOtherMethod\t" + s2.name); // william
        someOtherMethod(s2);
        System.out.println("after calling someOtherMethod\t" + s2.name); // Foobar
    }
}

/* 
    Passing such a reference falls under pass-by-value because a variable's value is technically the reference itself, not the referred object.
    ref: https://stackoverflow.com/questions/373419/whats-the-difference-between-passing-by-reference-vs-passing-by-value
    
    Example-1 explaination:
    1. Student s1 = new Student(); s1'id = 23 and name is 'john'
    2. s1 value will be say '0x658f'
    3. '0x658f' will be holding value say '0x0223'
    3. '0x0223' holds the actual data i.e., s1'id = 23 and name is 'john'
    4. Now we are passing a reference type to method someMethod() i.e., we are sending '0x658f' as argument
    5. Now inside someMethod() , before 'student = new Student();' line of code, 'student' variable is having the value '0x658f' ('0x658f' has value '0x0223')

    6. At this point (i.e., before 'student = new Student();' line of code), both 's1' variable and 'student' variable both are having values '0x658f'
    7. After execution of 'student = new Student();' line of code, 'student' variable will be having value of say '0x556a', '0x556a' will point to say '0x111f' 
    8. '0x111f' will be holding new Student data (id and name being 100 & 'doe' respectively)
    9. 's1' variable still has value of '0x658f' ('0x658f' has value '0x0223')
    10. So, mapping is as follows:
        s1 -> '0x658f' -> '0x0223', '0x0223' is in heap and holds actual data (23, john)
        student -> '0x556a' -> '0x111f', '0x111f' is in heap and holds actual data (100, doe)
    11. Hence after invoking someMethod(), s1 fields does not change.
*/