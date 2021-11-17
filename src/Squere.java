public class Squere extends Shape{
    int m;
Squere (int m) {
    this.m = m;
    }

    @Override
    public void draw() {

        System.out.println("Квадрат");
    }

    @Override
    public void getSq() {
        System.out.println(m*m);
    }
}
