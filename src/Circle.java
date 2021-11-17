public class Circle extends Shape{
    int r;
Circle(int r) {
    this.r = r;
    }

    @Override
    public void draw() {
        System.out.println("Круг");
    }

    @Override
    public void getSq() {
        System.out.println(3.14*r*r);
    }
}
