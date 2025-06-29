#ifndef SELECTION_SORT
#define SELECTION_SORT

#include <iostream>
#include <string>

class SelectionSort{

    public:
        void printArray(int* arrayToPrint, int sizeOfArray, std::string arrayName);
        void sort(int* arrayToSort, int sizeOfArray);
};

#endif