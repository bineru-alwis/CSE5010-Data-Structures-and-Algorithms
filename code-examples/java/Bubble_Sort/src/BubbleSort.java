public class BubbleSort {

    public BubbleSort(){
    } //

    public void sort(int[] unsortedArray){
        int size = unsortedArray.length;
        int currentKey, nextKey;
        boolean switched;

        for(int j=0; j<size; j++){
            switched = false;
            for(int i=0; i<size-1-j; i++){ //i<size-1-j After each outer loop pass, the largest values are at the end, so using -j to reduce checking those at the end.

                printArray("Before",unsortedArray);

                currentKey = unsortedArray[i];
                nextKey = unsortedArray[i+1];
                System.out.print("current & Next index: "+i+", "+(i+1));
                System.out.print(", current value: "+currentKey);
                System.out.print(", Next value: "+nextKey);

                //if the next value in the array is smaller, then switch two numbers
                if(currentKey>nextKey){
                    unsortedArray[i] = nextKey;
                    unsortedArray[i+1] = currentKey;
                    switched = true;
                    System.out.println(", Switched");
                }else System.out.println(", Not Switched");
                printArray("After",unsortedArray);
                System.out.println("---");

            }
            System.out.println("Total number of iterations "+j+"");
            System.out.println("");

            /*condition to check if the array is sorted. if nothing is switched in the last iteration then the array is sorted
            no need to continue. stop the for loop.*/
            if (switched==false){
                break;
            }
        }

    }

    //Method to print any Array
    public void printArray(String arrayName, int[] printArray){
        //print the array
        int size = printArray.length;

        System.out.print(arrayName+": [");
        for(int i=0; i<size; i++){
            System.out.print(printArray[i]);
            if(i!=size-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
