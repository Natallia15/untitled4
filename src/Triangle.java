public class Triangle extends Shape{
    int a;
    int h;
Triangle(int a, int h) {
    this.a = a;
    this.h = h;
    }

    @Override
    public void draw() {
        System.out.println("Треугольник");
    }

    @Override
    public void getSq() {
        System.out.println(h*a*0.5);
    }
}
