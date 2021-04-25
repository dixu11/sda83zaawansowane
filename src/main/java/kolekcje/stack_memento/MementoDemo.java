package kolekcje.stack_memento;

import java.util.Scanner;

class MementoDemo {

    //Wykorzystaj wzorzec memento do zaimplementowania historii ruchów figury szachowej
    //W implementacji zastosuj kolekcję stack (stos) -> w javie implementujemy za pomocą interfejsu Deque


    public static void main(String[] args) {
        //Rook
        //RookMemento
        //RookCaretaker

        //Board

        Rook rook = new Rook(4,0,ChessColor.BLACK);
        Board board = new Board(rook);
        RookCaretaker caretaker = new RookCaretaker(rook);
        Scanner scanner = new Scanner(System.in);

       /* board.display();
        caretaker.save();
        rook.move(5, 0);
        board.display();
        caretaker.restore();
        board.display();
        caretaker.restore();
        board.display();*/

        board.display();
        //todo do domu -> wieża która obchodzi planszę
        for (int i = 0; i < 7; i++) {
            caretaker.save();
            scanner.nextLine();
            rook.move(rook.getRow(), rook.getCol()+1);
            board.display();
        }

        for (int i = 0; i < 7; i++) {
            scanner.nextLine();
            caretaker.restore();
            board.display();
        }
    }


}
