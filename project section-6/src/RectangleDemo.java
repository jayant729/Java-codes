public class RectangleDemo{
    public static void main(String[] args){
        Rectangle r1=new Rectangle();
        Rectangle r2=new Rectangle(5,10);
        Rectangle r3=new Rectangle(10,10);

        System.out.println("Num of rectangle: "+ Rectangle.getnumRectangles());
        System.out.println("Area of rectangle: "+ r1.area());
        System.out.println("Area of rectangle: "+ r2.area());
        System.out.println("Area of rectangle: "+ r3.area());

        System.out.println("Peri of rectangle: "+ r1.peri());
        System.out.println("Peri of rectangle: "+ r2.peri());
        System.out.println("Peri of rectangle: "+ r3.peri());
    }
}