interface Drawable{
    void draw();
}
class Rectangle implements Drawable{
    public void draw(){
        System.out.println("Drawing rectangle");
    }
}
class circle implements Drawable{
    public void draw(){
        System.out.println("Drawing circle");
    }
}

public class Interface {
    public static void main(String[] args) {
        Drawable d = new circle();
        d.draw();
    }
}
