public class Trapezium extends GeometricFigure{
    private double sideA;
    private double sideB;
    private double high;
    public Trapezium(double sideA, double sideB, double high){
        this.sideA = sideA;
        this.sideB = sideB;
        this.high = high;
    }
    public double Area(){
        return 0.5 *( sideA + sideB)*high;
    }
    public double Perimeter(){
        double v = sideA + sideB;
        return v;
    }
    public static void main(String[] args){
        Trapezium t = new Trapezium(1.5, 3.5, 5.5);
        System.out.println(t.Area()+ "  = Area");
        System.out.println(t.Perimeter()+ " = Perimeter");
    }

}
