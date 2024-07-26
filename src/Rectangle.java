public class Rectangle extends GeometricFigure{
    private double sideA;
    private double sideB;
    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }
    public double Area(){
        return sideA * sideB;
    }
    public double Perimeter(){
        return (sideA + sideB)*2;
    }
    public static void main(String[] args){
        Rectangle rectangle = new Rectangle(5.0, 5.0);
        System.out.println(rectangle.Area()+" = Area");
        System.out.println(rectangle.Perimeter()+" = Perimeter");
    }

}
