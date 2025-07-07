public class Square extends Rectangle{
    //assume that side is length:
    public Square(){
        setLength(1);
    }

    public Square(double side){
        setLength(side);
    }

    public Square(double side, String color, boolean isFilled) {
        setLength(side);
        setColor(color);
        setFilled(isFilled);
    }

    public double getSide() {
        return getLength();
    }

    public void setSide(double side){
        setLength(side);
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
