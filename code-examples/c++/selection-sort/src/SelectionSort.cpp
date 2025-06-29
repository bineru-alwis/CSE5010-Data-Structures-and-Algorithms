#include "SelectionSort.h"

void SelectionSort::sort(int* arrayToSort, int sizeOfArray){



    for(int i=0; i<sizeOfArray; i++){


        for(int j=0; j<sizeOfArray; j++){

            
        }













    }

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