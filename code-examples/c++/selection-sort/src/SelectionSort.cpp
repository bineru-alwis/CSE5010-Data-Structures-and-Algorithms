#include "SelectionSort.h"

void SelectionSort::sort(int* arrayToSort, int sizeOfArray){

    printArray(arrayToSort, sizeOfArray, "Unsorted Array");
    std::cout<<"----"<<std::endl;

    int minValueI;

    for(int i=0; i<sizeOfArray; i++){

        minValueI = i;

        for(int j=i+1; j<sizeOfArray; j++){

            if(arrayToSort[minValueI]>arrayToSort[j]){
                minValueI = j;
            }
        }

        if(minValueI!=i){
            int minValue = arrayToSort[minValueI];
            arrayToSort[minValueI] = arrayToSort[i];
            arrayToSort[i] = minValue;
        }

        std::cout<<"Iteration "<<i<<" ";
        printArray(arrayToSort, sizeOfArray, "Array");
    }
    
    std::cout<<"----"<<std::endl;
    printArray(arrayToSort, sizeOfArray, "Sorted Array");
}



//Method to print any array
void SelectionSort::printArray(int* arrayToPrint, int sizeOfArray, std::string arrayName){
    std::cout<<arrayName<<": [";

    for(int i=0; i<sizeOfArray; i++){
        std::cout<<arrayToPrint[i];
        if(i!=(sizeOfArray-1)){
            std::cout<<", ";
        }else{
            std::cout<<"]"<<std::endl;
        }
    }
}