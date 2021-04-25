package kolekcje.stack_memento;

class Rook {

    private int row;
    private int col;
    private ChessColor color;
    private String symbol = "♜";

    Rook(int row, int col, ChessColor color) {
        this.row = row;
        this.col = col;
        this.color = color;
    }

    public void move(int newRow,int newCol){
        if (newRow < 0 || newCol < 0 || newRow >= 8 || newCol >= 8) {
            System.out.println("Poza planszą!");
            return;
        }
        if (newRow == row && newCol == col) {
            System.out.println("Ta sama pozycja co ostatnio");
            return;
        }
        if (row != newRow && col != newCol) {
            System.out.println("Niepoprawny ruch dla wieży");
            return;
        }
        row = newRow;
        col = newCol;
    }

    public RookMemento createMemento() {
       return new RookMemento(row, col);
    }

    public void restore(RookMemento rookMemento) {
        row = rookMemento.getRow();
        col = rookMemento.getCol();
    }

    int getRow() {
        return row;
    }

    int getCol() {
        return col;
    }

    String getSymbol() {
        return symbol;
    }
}


//    0 1 2
//  0 O O O
//  1 O O O
//  2 O O O
