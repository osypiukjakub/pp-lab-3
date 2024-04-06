public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    

    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

}


public class Main {
    public static void main(String[] args) {
        // Tworzenie obiektu klasy Point i inicjowanie go wartościami
        Point point = new Point(4.0, 2.0);
        
        // Wyświetlanie współrzędnych punktu
        System.out.println("Wspolrzedne dla punktu (" + point.getX() + ", " + point.getY() + ")");
    }
}
