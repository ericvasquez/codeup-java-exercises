package shapes;

public class Square extends Rectangle {


    public Square(int side) {
        super(side,side);
    }


@Override
    public  int getPerimeter(){
        return length*4;
    }

@Override
    public  int getArea(){
        return (int)Math.pow(length,2);
    }

}
