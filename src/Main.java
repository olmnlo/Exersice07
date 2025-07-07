public class Main {
    public static void main(String[] args) {
        //default constructor
        Shape default_shape = new Shape();
        divider("default_shape");
        System.out.println(default_shape.toString());
        default_shape.setColor("red");
        default_shape.setFilled(false);
        System.out.println(default_shape.toString());
        System.out.println("color: "+default_shape.getColor());
        System.out.println("is filled: "+default_shape.isFilled());
        divider("default_shape");

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
        default_circle.setFilled(false);
        default_circle.setColor("Ocean");
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
        init_rad_circle.setFilled(false);
        init_rad_circle.setColor("Pink");
        System.out.println(init_rad_circle.toString());
        System.out.println("circle radius: "+ init_rad_circle.getRadius());
        System.out.println("area: "+ init_rad_circle.getArea());
        System.out.println("circle perimeter: "+ init_rad_circle.getPerimeter());
        divider("init_rad_circle");

        System.out.println();

        Circle init_super_circle = new Circle("Orange", true, 4);
        divider("init_super_circle");
        System.out.println(init_super_circle.toString());
        System.out.println("circle radius: "+ init_super_circle.getRadius());
        System.out.println("area: "+ init_super_circle.getArea());
        System.out.println("perimeter: "+ init_super_circle.getPerimeter());
        init_super_circle.setRadius(3);
        init_super_circle.setFilled(false);
        init_super_circle.setColor("Black");
        System.out.println(init_super_circle.toString());
        System.out.println("circle radius: "+ init_super_circle.getRadius());
        System.out.println("area: "+ init_super_circle.getArea());
        System.out.println("perimeter: "+ init_super_circle.getPerimeter());
        divider("init_super_circle");

        System.out.println();

        Circle circle1 = new Circle("Blue", false, 5);
        divider("circle1");
        System.out.println(circle1.toString());
        System.out.println("circle radius: " + circle1.getRadius());
        System.out.println("area: " + circle1.getArea());
        System.out.println("perimeter: " + circle1.getPerimeter());
        circle1.setRadius(7);
        circle1.setFilled(true);
        circle1.setColor("Green");
        System.out.println(circle1.toString());
        System.out.println("circle radius: " + circle1.getRadius());
        System.out.println("area: " + circle1.getArea());
        System.out.println("perimeter: " + circle1.getPerimeter());
        divider("circle1");

        System.out.println();

        Circle circle2 = new Circle("Red", true, 6);
        divider("circle2");
        System.out.println(circle2.toString());
        System.out.println("circle radius: " + circle2.getRadius());
        System.out.println("area: " + circle2.getArea());
        System.out.println("perimeter: " + circle2.getPerimeter());
        circle2.setRadius(2);
        circle2.setFilled(false);
        circle2.setColor("Yellow");
        System.out.println(circle2.toString());
        System.out.println("circle radius: " + circle2.getRadius());
        System.out.println("area: " + circle2.getArea());
        System.out.println("perimeter: " + circle2.getPerimeter());
        divider("circle2");


        System.out.println();

        Rectangle default_rectangle = new Rectangle();
        divider("default_rectangle");
        System.out.println(default_rectangle.toString());
        System.out.println("width: "+default_rectangle.getWidth());
        System.out.println("length: "+ default_rectangle.getLength());
        System.out.println("area: "+ default_rectangle.getArea());
        System.out.println("perimeter: "+ default_rectangle.getPerimeter());
        default_rectangle.setLength(8);
        default_rectangle.setWidth(6);
        default_rectangle.setFilled(false);
        default_rectangle.setColor("Black");
        System.out.println(default_rectangle.toString());
        System.out.println("width: "+default_rectangle.getWidth());
        System.out.println("length: "+ default_rectangle.getLength());
        System.out.println("area: "+ default_rectangle.getArea());
        System.out.println("perimeter: "+ default_rectangle.getPerimeter());
        divider("default_rectangle");

        System.out.println();

        Rectangle init_wid_len_rectangle = new Rectangle(10,5);
        divider("init_wid_len_rectangle");
        System.out.println(init_wid_len_rectangle.toString());
        System.out.println("width: "+init_wid_len_rectangle.getWidth());
        System.out.println("length: "+ init_wid_len_rectangle.getLength());
        System.out.println("area: "+ init_wid_len_rectangle.getArea());
        System.out.println("perimeter: "+ init_wid_len_rectangle.getPerimeter());
        init_wid_len_rectangle.setLength(8);
        init_wid_len_rectangle.setWidth(6);
        init_wid_len_rectangle.setFilled(false);
        init_wid_len_rectangle.setColor("Black");
        System.out.println(init_wid_len_rectangle.toString());
        System.out.println("width: "+init_wid_len_rectangle.getWidth());
        System.out.println("length: "+ init_wid_len_rectangle.getLength());
        System.out.println("area: "+ init_wid_len_rectangle.getArea());
        System.out.println("perimeter: "+ init_wid_len_rectangle.getPerimeter());
        divider("init_wid_len_rectangle");

        System.out.println();

        Rectangle init_super_constructor_rectangle = new Rectangle("Orange", true, 15, 20);
        divider("init_super_constructor_rectangle");
        System.out.println(init_super_constructor_rectangle.toString());
        System.out.println("width: "+init_super_constructor_rectangle.getWidth());
        System.out.println("length: "+ init_super_constructor_rectangle.getLength());
        System.out.println("area: "+ init_super_constructor_rectangle.getArea());
        System.out.println("perimeter: "+ init_super_constructor_rectangle.getPerimeter());
        init_super_constructor_rectangle.setLength(8);
        init_super_constructor_rectangle.setWidth(6);
        init_super_constructor_rectangle.setFilled(false);
        init_super_constructor_rectangle.setColor("Black");
        System.out.println(init_super_constructor_rectangle.toString());
        System.out.println("width: "+init_super_constructor_rectangle.getWidth());
        System.out.println("length: "+ init_super_constructor_rectangle.getLength());
        System.out.println("area: "+ init_super_constructor_rectangle.getArea());
        System.out.println("perimeter: "+ init_super_constructor_rectangle.getPerimeter());
        divider("init_super_constructor_rectangle");

        System.out.println();

        Rectangle rectangle1 = new Rectangle("Blue", false, 12, 18);
        divider("rectangle1");
        System.out.println(rectangle1.toString());
        System.out.println("width: " + rectangle1.getWidth());
        System.out.println("length: " + rectangle1.getLength());
        System.out.println("area: " + rectangle1.getArea());
        System.out.println("perimeter: " + rectangle1.getPerimeter());
        rectangle1.setLength(10);
        rectangle1.setWidth(5);
        rectangle1.setFilled(true);
        rectangle1.setColor("Red");
        System.out.println(rectangle1.toString());
        System.out.println("width: " + rectangle1.getWidth());
        System.out.println("length: " + rectangle1.getLength());
        System.out.println("area: " + rectangle1.getArea());
        System.out.println("perimeter: " + rectangle1.getPerimeter());
        divider("rectangle1");

        System.out.println();

        Rectangle rectangle2 = new Rectangle("Green", true, 20, 25);
        divider("rectangle2");
        System.out.println(rectangle2.toString());
        System.out.println("width: " + rectangle2.getWidth());
        System.out.println("length: " + rectangle2.getLength());
        System.out.println("area: " + rectangle2.getArea());
        System.out.println("perimeter: " + rectangle2.getPerimeter());
        rectangle2.setLength(14);
        rectangle2.setWidth(9);
        rectangle2.setFilled(false);
        rectangle2.setColor("Gray");
        System.out.println(rectangle2.toString());
        System.out.println("width: " + rectangle2.getWidth());
        System.out.println("length: " + rectangle2.getLength());
        System.out.println("area: " + rectangle2.getArea());
        System.out.println("perimeter: " + rectangle2.getPerimeter());
        divider("rectangle2");


        System.out.println();

        Square default_square = new Square();
        divider("default_square");
        System.out.println(default_square.toString());
        System.out.println("width: "+default_square.getWidth());
        System.out.println("side: "+ default_square.getSide());
        System.out.println("area: "+ default_square.getArea());
        System.out.println("perimeter: "+ default_square.getPerimeter());
        default_square.setSide(8);
        default_square.setWidth(6);
        default_square.setFilled(false);
        default_square.setColor("Black");
        System.out.println(default_square.toString());
        System.out.println("width: "+default_square.getWidth());
        System.out.println("side: "+ default_square.getSide());
        System.out.println("area: "+ default_square.getArea());
        System.out.println("perimeter: "+ default_square.getPerimeter());
        divider("default_square");

        System.out.println();

        Square init_side_square = new Square(10);
        divider("init_side_square");
        System.out.println(init_side_square.toString());
        System.out.println("width: "+init_side_square.getWidth());
        System.out.println("side: "+ init_side_square.getSide());
        System.out.println("area: "+ init_side_square.getArea());
        System.out.println("perimeter: "+ init_side_square.getPerimeter());
        init_side_square.setSide(8);
        init_side_square.setWidth(6);
        init_side_square.setFilled(false);
        init_side_square.setColor("Black");
        System.out.println(init_side_square.toString());
        System.out.println("width: "+init_side_square.getWidth());
        System.out.println("side: "+ init_side_square.getSide());
        System.out.println("area: "+ init_side_square.getArea());
        System.out.println("perimeter: "+ init_side_square.getPerimeter());
        divider("init_side_square");

        System.out.println();

        Square init_super_square = new Square(10, "Yellow", true);
        divider("init_super_square");
        System.out.println(init_super_square.toString());
        System.out.println("width: "+init_super_square.getWidth());
        System.out.println("side: "+ init_super_square.getSide());
        System.out.println("area: "+ init_super_square.getArea());
        System.out.println("perimeter: "+ init_super_square.getPerimeter());
        init_super_square.setSide(8);
        init_super_square.setWidth(6);
        init_super_square.setFilled(false);
        init_super_square.setColor("Black");
        System.out.println(init_super_square.toString());
        System.out.println("width: "+init_super_square.getWidth());
        System.out.println("side: "+ init_super_square.getSide());
        System.out.println("area: "+ init_super_square.getArea());
        System.out.println("perimeter: "+ init_super_square.getPerimeter());
        divider("init_super_square");

        System.out.println();

        Square square1 = new Square(12, "Blue", true);
        divider("square1");
        System.out.println(square1.toString());
        System.out.println("width: " + square1.getWidth());
        System.out.println("side: " + square1.getSide());
        System.out.println("area: " + square1.getArea());
        System.out.println("perimeter: " + square1.getPerimeter());
        square1.setSide(7);
        square1.setWidth(5);
        square1.setFilled(false);
        square1.setColor("Gray");
        System.out.println(square1.toString());
        System.out.println("width: " + square1.getWidth());
        System.out.println("side: " + square1.getSide());
        System.out.println("area: " + square1.getArea());
        System.out.println("perimeter: " + square1.getPerimeter());
        divider("square1");

        System.out.println();

        Square square2 = new Square(9, "Green", false);
        divider("square2");
        System.out.println(square2.toString());
        System.out.println("width: " + square2.getWidth());
        System.out.println("side: " + square2.getSide());
        System.out.println("area: " + square2.getArea());
        System.out.println("perimeter: " + square2.getPerimeter());
        square2.setSide(10);
        square2.setWidth(10);
        square2.setFilled(true);
        square2.setColor("Red");
        System.out.println(square2.toString());
        System.out.println("width: " + square2.getWidth());
        System.out.println("side: " + square2.getSide());
        System.out.println("area: " + square2.getArea());
        System.out.println("perimeter: " + square2.getPerimeter());
        divider("square2");

        System.out.println();

    }
    public static void divider(String msg){
        System.out.printf("---------------------%s-----------------------------\n", msg);
    }
}