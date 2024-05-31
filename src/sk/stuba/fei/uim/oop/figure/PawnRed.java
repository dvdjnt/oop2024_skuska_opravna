package sk.stuba.fei.uim.oop.figure;

import sk.stuba.fei.uim.oop.figure.Figure;

public class PawnRed implements Figure {

    private int position;
    private int step;

    public PawnRed() {
        this.position = 0;
        this.step = 1;
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

    @Override
    public int getStep() {
        return step;
    }
}
