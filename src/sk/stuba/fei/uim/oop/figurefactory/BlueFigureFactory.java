package sk.stuba.fei.uim.oop.figurefactory;

import sk.stuba.fei.uim.oop.figure.BishopBlue;
import sk.stuba.fei.uim.oop.figure.Figure;
import sk.stuba.fei.uim.oop.figure.PawnBlue;
import sk.stuba.fei.uim.oop.figure.QueenBlue;

public class BlueFigureFactory implements FigureFactory {
    @Override
    public Figure createPawn() {
        return new PawnBlue();
    }

    @Override
    public Figure createBishop() {
        return new BishopBlue();
    }

    @Override
    public Figure createQueen() {
        return new QueenBlue();
    }
}
