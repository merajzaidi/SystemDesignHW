package org.example.homework1;

class BubbleSortStrategy implements SortingStrategy{

    @Override
    public void sort() {
        System.out.println("Applied Bubble Soring");
    }
}

class SelectionSortStrategy implements SortingStrategy{

    @Override
    public void sort() {
        System.out.println("Applied Selection Soring");
    }
}

class InsertionSortStrategy implements SortingStrategy{

    @Override
    public void sort() {
        System.out.println("Applied Insertion Soring");
    }
}
public class SortingStrategyImpl {
}
