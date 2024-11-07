package DMD;

import DMD.Figure;

public class Rectangle extends Figure {

    public Rectangle(int x, int y) {
        super(x, y);
    }

    @Override
    public void area() {
        System.out.println("Area of Rectangle : " + (x * y));
    }

}
