import geometry.Circle;
import geometry.Point;
import geometry.ColoredCircle;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(4.0, 2.0);
        System.out.println("Wspolrzedne dla punktu (" + point.getX() + ", " + point.getY() + ")");
        ColoredCircle coloredCircle = new ColoredCircle(point, 24, "zielony");
        Circle circle = new Circle(point, 7.0);
        
    
        System.out.println("obwod: " + circle.calculatePerimeter());
        System.out.println("srodek: (" + circle.getCenter().getX() + ", " + circle.getCenter().getY() + ")");
        System.out.println("promien: " + circle.getRadius());
        System.out.println("kolor " + coloredCircle.getColor());
        
    }
}
