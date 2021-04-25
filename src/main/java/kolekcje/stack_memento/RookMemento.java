package kolekcje.stack_memento;

class RookMemento {

    private final int row;
    private final int col;

    RookMemento(int row, int col) {
        this.row = row;
        this.col = col;
    }

    int getRow() {
        return row;
    }

    int getCol() {
        return col;
    }
}
