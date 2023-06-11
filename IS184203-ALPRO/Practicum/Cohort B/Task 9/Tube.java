public class Tube{

    double radius; //atribut dari class
    double height; //atribut dari class

    public Tube(double r, double t) { //ini adlh constructor, bikin constructor dulu baru bisa masukin value ke atribut yg ada
        radius = r;                   //constructor udh auto ada setiap mo bikin objek dr class
        height = t;      //klo mau pake nama double radius (nama yg sama) didalam constructor tsb, maka pake this.radius = radius
    }

    public double baseCircumference() {
        return 2 * Math.PI * radius;
    }

    public double baseArea() {
        return radius * radius * Math.PI;
    }

    public double area() {
        return baseArea() * 2 + baseCircumference() * height; 
    }

    public double volume() {
        return baseArea() * height; 
    }
}









