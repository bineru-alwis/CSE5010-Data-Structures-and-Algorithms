#include <iostream>
#include <array>
#include <string>
#include "BubbleSort.h"

int main(){
   
    BubbleSort myBubbleSort;

    int myUnsortedArray[10] = {5,1,6,7,2,9,10,8,4,3};

    myBubbleSort.sort(myUnsortedArray,sizeof(myUnsortedArray)/sizeof(myUnsortedArray[0]));

}
