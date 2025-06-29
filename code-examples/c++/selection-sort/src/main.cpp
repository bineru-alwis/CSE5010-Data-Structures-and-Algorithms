#include <iostream>
#include <SelectionSort.h>

int main(){

    int unsortedArray[10] = {10,9,8,7,6,5,4,3,2,1};
    
    SelectionSort mySelectionSort{};

    mySelectionSort.printArray(unsortedArray, sizeof(unsortedArray)/sizeof(unsortedArray[0]), "Unsorted Array");
    





}