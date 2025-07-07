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







    }
    public static void divider(String msg){
        System.out.printf("---------------------%s-----------------------------\n", msg);
    }
}