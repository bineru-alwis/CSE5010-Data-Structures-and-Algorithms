#ifndef BUBBLESORT
#define BUBBLESORT

#include <string>

class BubbleSort{

    private:
        int size;

    public:
        void sort(int* unsortedArray, int arraySize);
        void printArray(int* arrayToPrint, int arraySize, std::string arrayName);

};


#endif