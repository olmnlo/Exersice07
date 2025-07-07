public class Main {
    public static void main(String[] args) {
        //default constructor
        Shape default_shape = new Shape();
        divider("default shape");
        System.out.println(default_shape.toString());
        default_shape.setColor("red");
        default_shape.setFilled(false);
        System.out.println(default_shape.toString());
        System.out.println("color: "+default_shape.getColor());
        System.out.println("is filled: "+default_shape.isFilled());
        divider("default shape");

        System.out.println();

        Shape init_shape = new Shape("Blue", true);
        divider("init_shape");
        System.out.println(init_shape.toString());
        init_shape.setColor("red");
        init_shape.setFilled(false);
        System.out.println(init_shape.toString());
        System.out.println("color: "+init_shape.getColor());
        System.out.println("is filled: "+init_shape.isFilled());
        divider("init_shape");

        System.out.println();

        Circle default_circle = new Circle();
        divider("default_circle");
        System.out.println(default_circle.toString());
        System.out.println("circle radius: "+ default_circle.getRadius());
        System.out.println("area: "+ default_circle.getArea());
        System.out.println("circle perimeter: "+ default_circle.getPerimeter());
        default_circle.setRadius(3);
        System.out.println(default_circle.toString());
        System.out.println("circle radius: "+ default_circle.getRadius());
        System.out.println("area: "+ default_circle.getArea());
        System.out.println("circle perimeter: "+ default_circle.getPerimeter());
        divider("default_circle");

        System.out.println();

        Circle init_rad_circle = new Circle(5);
        divider("init_rad_circle");
        System.out.println(init_rad_circle.toString());
        System.out.println("circle radius: "+ init_rad_circle.getRadius());
        System.out.println("area: "+ init_rad_circle.getArea());
        System.out.println("circle perimeter: "+ init_rad_circle.getPerimeter());
        init_rad_circle.setRadius(3);
        System.out.println(init_rad_circle.toString());
        System.out.println("circle radius: "+ init_rad_circle.getRadius());
        System.out.println("area: "+ init_rad_circle.getArea());
        System.out.println("circle perimeter: "+ init_rad_circle.getPerimeter());
        divider("init_rad_circle");







    }
    public static void divider(String msg){
        System.out.printf("---------------------%s-----------------------------\n", msg);
    }
}