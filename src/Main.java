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





    }
    public static void divider(String msg){
        System.out.printf("---------------------%s-----------------------------\n", msg);
    }
}