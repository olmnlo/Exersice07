public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(){
        width = 1;
        length = 1;
    }

    public Rectangle(double width, double length) {
        setWidth(width);
        setLength(length);
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        setWidth(width);
        setLength(length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0){
            System.out.println("You cannot do this it is must be positive");
        }else {
            this.width = width;
        }
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length < 0){
            System.out.println("You cannot do this it is must be positive");
        }else {
            this.length = length;
        }
    }

    public double getArea(){
        return length*width;
    }

    public double getPerimeter(){
        return 2*(length+width);
    }

    @Override
    public String toString() {
        return "A Rectangle with width="+width+" and length="+length+", which is a subclass of "+super.toString();
    }
}
