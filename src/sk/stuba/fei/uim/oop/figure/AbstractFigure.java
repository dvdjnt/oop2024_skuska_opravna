package sk.stuba.fei.uim.oop.figure;

abstract public class AbstractFigure implements Figure {

    protected int position;
    protected int step;

    public AbstractFigure() {
        this.position = 0;
    }

    @Override
    public void move() {
        position += step;
    }

    @Override
    public int getPosition() {
        return this.position;
    }

    @Override
    public void setPosition(int position) {
        this.position = position;
    }

    public int getStep() {
        return this.step;
    }


}
