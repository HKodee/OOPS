
class Shape{
    public void area(){
        System.out.println("Displaying Shape");
    }
}

class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println("Area of Triangle: " + (0.5 * l * h));
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.area();
        Triangle t = new Triangle();
        t.area();
        t.area(5, 10);
        
    }
}