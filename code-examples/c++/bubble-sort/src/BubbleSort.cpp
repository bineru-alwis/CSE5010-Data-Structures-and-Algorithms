#include <iostream>
#include <string>
#include <BubbleSort.h>

void BubbleSort::sort(int* unsortedArray, int arraySize){

    printArray(unsortedArray, arraySize, "Unsorted Array: ");
    std::cout<<std::endl;
    int currentValue, nextValue;
    bool switched;

    for(int j=0; j<arraySize; j++){

        switched = false;
        std::cout<<"Iteration Number: "<<(j+1)<<std::endl;
        printArray(unsortedArray, arraySize, "Before: ");
        for(int i=0; i<(arraySize-1-j); i++){
            currentValue = unsortedArray[i];
            nextValue = unsortedArray[i+1];
            std::cout<<"Current-Value: "<<currentValue<<", Next-Value: "<<nextValue;

            //if the current value is larger than the next value, then switch
            if(currentValue>nextValue){
                unsortedArray[i] = nextValue;
                unsortedArray[i+1] = currentValue;
                std::cout<<", Switched"<<std::endl;
                switched=true;
            }else{
                std::cout<<", Not-Switched"<<std::endl;
            }
        }
        printArray(unsortedArray, arraySize, "After: ");
        std::cout<<std::endl;

        if(switched==false){
            break;
        }
    }
}

//method to print any array.
void BubbleSort::printArray(int* arrayToPrint, int arraySize, std::string arrayName){
    
    std::cout<<arrayName<<" : [";

    for(int i=0; i<arraySize; i++){
        std::cout<<arrayToPrint[i];
        
        if(i!=(arraySize-1)){
            std::cout<<", ";
        }else{
            std::cout<<"]"<<std::endl;
        }
    }
}