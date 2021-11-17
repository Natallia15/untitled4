public class Main {
    public static void main (String [] args){
        Shape squere = new Squere(5);
        Shape circle = new Circle(5);
        Shape triangle = new Triangle(5, 10);
        squere.draw();
        squere.getSq();
        triangle.draw();
        triangle.getSq();
        circle.draw();
        circle.getSq();

        Printer printer = new Printer();
        printer.print(circle);
        printer.print(squere);
        printer.print(triangle);
    }
}
