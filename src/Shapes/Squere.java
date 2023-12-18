package Shapes;

public class Squere extends Rect{
    public Squere() {
        super();
    }

    public Squere(float side) {
        super(side, side);
    }

    public Squere(float side, String color, boolean filled) {
        super(color, filled, side, side);
    }

    public float getSide(){
        return getWidth();
    }

    public void setSide(float side){
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(float side) {
        this.setSide(side);
    }

    @Override
    public void setLength(float side) {
        this.setSide(side);
    }

    @Override
    public String toString() {
        return "Squere{" + super.toString() + "}";
    }
}
