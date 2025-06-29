#include <iostream>
#include <SelectionSort.h>

int main(){

    int unsortedArray[10] = {8,5,1,10,7,3,9,2,6,4};
    
    SelectionSort mySelectionSort{};

    mySelectionSort.sort(unsortedArray, sizeof(unsortedArray)/sizeof(unsortedArray[0]));

}