package kolekcje.stack_memento;

class Board {

    private Rook rook;

    Board(Rook rook) {
        this.rook = rook;
    }

    public void display() {
        //rzędy
        for (int i = 0; i < 20; i++) {
            System.out.println();
        }
        for (int row = 0; row <8 ; row++) {
            //drukowanie wszystkich kolumn
            for (int col = 0; col < 8; col++) {
                System.out.print(getFieldSymbol(row,col));
            }
            System.out.println();
        }

    }

    private String getFieldSymbol(int row, int col) {
        if (rook.getRow() == row && rook.getCol() == col) {
            return rook.getSymbol()+" ";
        }
        return "[] ";
    }
}
