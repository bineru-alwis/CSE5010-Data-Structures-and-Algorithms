//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        SelectionSort mySelectionSort = new SelectionSort();

        int[] unSortedArray = {3,8,7,10,4,9,6,5,2,1};

        //mySelectionSort.printArray(unSortedArray, "Unsorted Array");

        mySelectionSort.sort(unSortedArray);

    }
}