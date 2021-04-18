package kolekcje;

import java.util.LinkedList;
import java.util.List;

class Listy {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        names.add("D");
        names.add("R");
        names.add("A");
        names.add("W");
        System.out.println(names);


        /*ArrayList
        [D][R][W][F][][][][][][]
        LinkedList
        <A><D><R><W><F><Z>
         */
    }
}
/*

class Node{ // linkedlisty przechowują obiekty typu Node -> zawierają one przechowywany element i referencję do kolejnego Node
    Object data;
    Node nextNode;
}
*/
