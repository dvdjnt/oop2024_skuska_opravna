package sk.stuba.fei.uim.oop.figure;

import sk.stuba.fei.uim.oop.figure.Figure;

public class QueenRed implements Figure {

    private int position;
    private int step;

    public QueenRed() {
        this.position = 0;
        this.step = 6;
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
