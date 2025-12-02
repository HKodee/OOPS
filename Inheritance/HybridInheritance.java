
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

class EquilateralTriangle extends Triangle{
    public void area(int a){
        System.out.println("Area of Equilateral Triangle: " + (Math.sqrt(3) / 4 * a * a));
    }
}

class Circle extends Shape{
    public void area(int r){
        System.out.println("Area of Circle: " + (3.14 * r * r));
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.area();
        Triangle t = new Triangle();
        t.area();
        t.area(5, 10);
        EquilateralTriangle et = new EquilateralTriangle();
        et.area(6);
        Circle c = new Circle();
        c.area(7);
        
    }
}