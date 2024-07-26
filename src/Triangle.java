public class Triangle extends GeometricFigure{
private double SideA;
private double SideB;
private double SideC;
    public Triangle(double SideA, double SideB , double SideC){
    this.SideA = SideA;
    this.SideB = SideB;
    this.SideC = SideC;
}
public double getSideA(){
return SideA;
}
    public void setSideA(double SideA){
        this.SideA = SideA;
    }

public double getSideB(){
    return SideB;
}
public void setSideB(double SideB){
    this.SideB = SideB;
}
public double getSideC(){
    return SideC;
}
public void setSideC(double SideC){
    this.SideC = SideC;
}
public double Parimeter(){
    return SideA + SideB + SideC;
}

public double Area() {
    double s = Parimeter() / 2;
return Math.sqrt(s * (s - SideA) * (s - SideB) * (s - SideC));
}
public static void main(String[] args) {
    Triangle tr = new Triangle(5.0,4.0,3.0 );
    System.out.println("Parimeter =  "+tr.Parimeter());
    System.out.println("Area = "+tr.Area());
}
}
