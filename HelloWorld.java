class person{
    int age;
    int salary;
    person(int x, int y){
        age = x;
        salary = y;
    }

    int get_age(){
        return age;
    }
    int get_salary(){
        return salary;
    }
}

class empolyee extends person{
    int emmpolyee_id;

    empolyee(int x, int y , int z){
        super(x, y);
        emmpolyee_id= z ;
    }

    int get_age(){
        age = age+10;
        return age;
    }

    int get_emplyee_id(){
        return emmpolyee_id;
    }

} 

public class HelloWorld {
    public static void main(String[] args) {
        person p1 = new person(12, 23);
        System.out.println("Age is "+ p1.get_age());

        // employee
        empolyee e1 = new empolyee(12, 23,112);
        System.out.println("Age is "+e1.get_age());
        System.out.println("Emplyee ID is "+e1.get_emplyee_id());
        System.out.println("Salary is "+e1.get_salary());
    }
}

// writa a program ot create a class known as person with methods called get_age and get_salary .
// Create a subclass called employee that adds a new method called fet_emmplyee_id and overrides the get_age method to include the employees of job title 


