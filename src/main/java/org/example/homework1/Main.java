package org.example.homework1;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{8,3,5,2};
        Operation opt1 = new AppendOps(arr,5);
        opt1.execute();

        Operation opt2 = new RemoveOps(arr,8);
        opt2.execute();

        Operation opt3 = new ShuffleOps(arr);
        opt3.execute();

        SortingStrategy bubble = new BubbleSortStrategy();
        SortingStrategy insertion = new InsertionSortStrategy();
        Operation op4 = new SortOps(bubble,arr);
        op4.execute();

        op4 = new SortOps(insertion,arr);
        op4.execute();
    }
}
