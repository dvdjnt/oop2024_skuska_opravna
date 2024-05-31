package sk.stuba.fei.uim.oop.item;

import sk.stuba.fei.uim.oop.figure.AbstractFigure;
import sk.stuba.fei.uim.oop.figure.Figure;

public class CoatDecorator extends AbstractFigure {

    private AbstractFigure target;
    private int boost;

    public CoatDecorator(Figure figure) {
        this.target = (AbstractFigure) figure;
        this.boost = 3;
    }

    @Override
    public void move() {
        int targetPos = target.getPosition();
        int targetStep = target.getStep();

        target.setPosition(targetPos + targetStep + boost);
    }

    @Override
    public int getPosition() {
        return target.getPosition();
    }

    @Override
    public void setPosition(int position) {
        target.setPosition(position);
    }

    @Override
    public int getStep() {
        return target.getStep() + boost;
    }
}
