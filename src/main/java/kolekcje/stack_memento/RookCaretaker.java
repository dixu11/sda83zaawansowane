package kolekcje.stack_memento;

import java.util.Deque;
import java.util.LinkedList;

class RookCaretaker {

    private Deque<RookMemento> history = new LinkedList<>();
    private Rook rook;

    RookCaretaker(Rook rook) {
        this.rook = rook;
    }

    public void save() {
        history.addLast(rook.createMemento());
    }

    public void restore() {
        if (history.isEmpty()) {
            return;
        }
        RookMemento rookMemento = history.removeLast();
        rook.restore(rookMemento);
    }




}
