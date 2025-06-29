#include <iostream>

void arrayFunction(int* myArray, int sizeofArray);

int main(){
    std::cout<<"Hello World!"<<std::endl;

    int myArray[5] = {1,2,3,4,5};

    int sizeofArray = sizeof(myArray) / sizeof(myArray[0]);

    std::cout<<"size of the array: "<<sizeofArray<<std::endl;

    arrayFunction(myArray, sizeofArray);


}

void arrayFunction(int* myArray, int sizeofArray){

     std::cout<<"size of the array from functioon: "<<sizeofArray<<std::endl;
        std::cout<<"functioon: "<<myArray<<std::endl;

        for (int i = 0; i < sizeofArray; i++)
        {
            std::cout<<"Array Element "<<i<<": "<<myArray[i]<<std::endl;
        }
        

}