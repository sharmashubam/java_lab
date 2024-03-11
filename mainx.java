class shape{
    int l;
    int b;
    shape(int x, int y){
        l = x;
        b = y;
    }

    double get_parameter(){
        return l+b;
    }
    double get_area(){
        return l*b;
    }
}

class circle extends shape{
    int r;

    circle(int l, int b,int c ){
        super(l,b);
        r = c;
    }

    double get_area(){
        return 3.14*r*r;
    }
    double get_parameter(){
        return 2*3.14*r;
    }
    
} 

public class mainx {
    public static void main(String[] args) {

        shape s1 = new shape(12, 23);
        System.out.println("Area is: "+s1.get_area());
        System.out.println("Parameter is: "+s1.get_parameter());

        // circle
        circle c1 = new circle(12,23,12);
        System.out.println("Area is: "+c1.get_area());
        System.out.println("Parameter is: "+c1.get_parameter());
    }
}



// write a java program to create a class called shape woith method s called get_parameter and get_area .
// create a subclass caled circle that overrides the get_parameter and get_area methods to calculate the area adn parameter of  a circle