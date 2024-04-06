import geometry.Circle;
import geometry.Point;
import geometry.ColoredCircle;
import geometry.Rectangle;
import geometry.Square;

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
        

        Circle[] circles = new Circle[6];
        circles[0] = new Circle(new Point(6, 3), 5);
        circles[1] = new ColoredCircle(new Point(1, 7), 7, "bialy");
        circles[2] = new Circle(new Point(2, 4), 7);
        circles[3] = new Circle(new Point(1, 5), 5);
        circles[4] = new Circle(new Point(6, 6), 5);
        circles[5] = new ColoredCircle(new Point(2, 5), 6, "pomaranczowy");
        
        for (Circle kolo : circles) {
            double area = kolo.calculateArea();
            System.out.println("Pole kola: " + area);
        
            if (kolo instanceof ColoredCircle) {
                ColoredCircle kolorowekolo = (ColoredCircle) kolo;
                String color = kolorowekolo.getColor();
                System.out.println("Kolor kola: " + color);
            }
        
        
        
        }


    }
}
