public class Main {
    public static void main(String[] args) {
//        Circle c = new Circle();
//        c.draw();
//        Square s = new Square();
//        s.draw();
        ShapeFactory sf = new ShapeFactory();
        Shape s = sf.getShape(0);
        s.draw();
    }
}