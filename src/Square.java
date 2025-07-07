public class Square extends Rectangle{
    //assume that side is length:
    public Square(){
        super.setLength(1);
    }

    public Square(double side){
        super.setLength(side);
    }

    public Square(double side, String color, boolean isFilled) {
        super.setLength(side);
        super.setColor(color);
        super.setFilled(isFilled);
    }

    public double getSide() {
        return super.getLength();
    }

    public void setSide(double side){
        super.setLength(side);
    }

    @Override
    public double getArea() {
        return getLength()*getLength();
    }

    @Override
    public double getPerimeter() {
        return getLength()*4;
    }

    @Override
    public String toString() {
        return "A Square with side="+getSide()+" which is a subclass of "+super.toString();
    }
}
