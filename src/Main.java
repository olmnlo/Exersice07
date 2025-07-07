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

        Circle init_all_circle = new Circle("Orange", true, 4);
        divider("init_all_circle");
        System.out.println(init_all_circle.toString());
        System.out.println("circle radius: "+ init_all_circle.getRadius());
        System.out.println("area: "+ init_all_circle.getArea());
        System.out.println("perimeter: "+ init_all_circle.getPerimeter());
        init_all_circle.setRadius(3);
        init_all_circle.setFilled(false);
        init_all_circle.setColor("Black");
        System.out.println(init_all_circle.toString());
        System.out.println("circle radius: "+ init_all_circle.getRadius());
        System.out.println("area: "+ init_all_circle.getArea());
        System.out.println("perimeter: "+ init_all_circle.getPerimeter());
        divider("init_all_circle");

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


    }
    public static void divider(String msg){
        System.out.printf("---------------------%s-----------------------------\n", msg);
    }
}