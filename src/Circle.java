public class Circle extends Shape{
    private double radius;

    public Circle(){
        radius = 1.0;
    }

    public Circle(double radius) {
        setRadius(radius);
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius < 0){
            System.out.println("You cannot do this it is must be positive");
        }else {
            this.radius = radius;
        }
    }

    public double getArea(){

        return Math.PI*Math.pow(radius, 2);
    }

    public double getPerimeter(){
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius="+radius+", which is a subclass of "+ super.toString();
    }
}
