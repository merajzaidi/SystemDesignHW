package org.example.homework1;


class ShuffleOps implements Operation {
    private int[] arr;
    ShuffleOps(int[] arr) {
        this.arr = arr;
    }
    @Override
    public void execute() {
        System.out.println("Applied Shuffle on array");
    }
}
class AppendOps implements Operation {
    private int[] arr;
    private int element;
    public AppendOps(int[] arr, int element) {
        this.arr = arr;
        this.element = element;
    }
    @Override
    public void execute() {
        System.out.println("Applied Append");
    }
}

class RemoveOps implements Operation {
    private int[] arr;
    private int element;
    public RemoveOps(int[] arr, int element) {
        this.arr = arr;
        this.element = element;
    }

    @Override
    public void execute() {
        System.out.println("Removed element");
    }
}
class SortOps implements Operation {
    private SortingStrategy sortingStrategy;
    private int[] arr;

    public SortOps(SortingStrategy sortingStrategy, int[] arr) {
        this.sortingStrategy = sortingStrategy;
        this.arr = arr;
    }

    @Override
    public void execute() {
        sortingStrategy.sort();
    }
}
public class OperationImpl {
}
