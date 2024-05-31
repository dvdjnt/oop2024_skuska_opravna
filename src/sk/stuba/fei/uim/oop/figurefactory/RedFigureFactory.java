package sk.stuba.fei.uim.oop.figurefactory;

import sk.stuba.fei.uim.oop.figure.BishopRed;
import sk.stuba.fei.uim.oop.figure.Figure;
import sk.stuba.fei.uim.oop.figure.PawnRed;
import sk.stuba.fei.uim.oop.figure.QueenRed;

public class RedFigureFactory implements FigureFactory {
    @Override
    public Figure createPawn() {
        return new PawnRed();
    }

    @Override
    public Figure createBishop() {
        return new BishopRed();
    }

    @Override
    public Figure createQueen() {
        return new QueenRed();
    }
}
