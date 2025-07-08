public class Square extends Rectangle{
    //assume that side is length:
    public Square(){
        super(1,1);
    }

    public Square(double side){
        super(side, side);
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
    public String toString() {
        return "A Square with side="+getSide()+" which is a subclass of "+super.toString();
    }
}
