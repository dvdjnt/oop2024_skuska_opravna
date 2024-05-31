package sk.stuba.fei.uim.oop.item;

import sk.stuba.fei.uim.oop.figure.Figure;

public class ShoesDecorator implements Figure {

    private Figure target;
    private int boostFactor;


    public ShoesDecorator(Figure figure) {
        this.target = figure;
        this.boostFactor = 2;
    }

    @Override
    public void move() {
        int targetPos = target.getPosition();
        int targetStep = target.getStep();
        target.setPosition(targetPos + targetStep * boostFactor);
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
        return target.getStep() * boostFactor;
    }
}
