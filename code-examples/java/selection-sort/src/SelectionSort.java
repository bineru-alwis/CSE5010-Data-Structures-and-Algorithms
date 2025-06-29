public class SelectionSort {

    void sort(int[] arrayToSort){

        printArray(arrayToSort, "Unsorted Array");
        System.out.println("-----");

        int arraySize = arrayToSort.length;
        int minimumIndex;

        for(int j=0; j<(arraySize-1); j++){

            minimumIndex = j;

            System.out.println("Current value: "+arrayToSort[minimumIndex]+", Minimum index: "+minimumIndex);

            for(int i=j+1; i<arraySize; i++){

                System.out.println("Comparing:"+arrayToSort[minimumIndex]+" and "+arrayToSort[i]);

                if(arrayToSort[minimumIndex]>arrayToSort[i]){
                    minimumIndex = i;
                    System.out.println("Lower value found at Index: "+minimumIndex);
                }
            }

            if(minimumIndex!=j){
                //arrayToSort[0] = currentValue;
                int minValue = arrayToSort[minimumIndex];
                arrayToSort[minimumIndex] = arrayToSort[j];
                arrayToSort[j] = minValue;

                System.out.println("Switching: "+ arrayToSort[minimumIndex] +" and "+arrayToSort[j]);
            }

            printArray(arrayToSort, "After");
            System.out.println("Iteration: "+j);
            System.out.println("-----");

        }
    }

    //function to print any array.
    void printArray(int[] arrayToPrint, String arrayName){

        System.out.print(arrayName+": [");
        int arraySize = arrayToPrint.length;

        for(int i=0; i<arraySize; i++){
            System.out.print(arrayToPrint[i]);

            if(i!=(arraySize-1)){
                System.out.print(", ");
            }else{
                System.out.println("]");
            }
        }
    }
}
