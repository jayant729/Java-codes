public class Rectangle{
    private double length;
    private double width;

    private static int numRectangles;

    public Rectangle(){
        this(1.0,1.0);
    }
    public Rectangle(double length,double width){
        this.length=length;
        this.width=width;
        numRectangles++;
    }

    public double getlength(){
        return length;
    }
    public void setlength(double length){
        this.length=length;
    }

    public double getwidth(){
        return width;
    }

    public void setwidth(double width){
        this.width=width;
    }

    public double area(){
        return length*width;
    }

    public static int getnumRectangles(){
       return numRectangles;
    }

    public double peri(){
        return 2*length + 2*width;
    }
}