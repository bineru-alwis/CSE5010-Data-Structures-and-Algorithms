#include "StackDSA.h"

#include <iostream>

StackDSA::StackDSA(int size){
    maxSize = size;
    stackArray = new int[maxSize];
    top = -1;
}

StackDSA::~StackDSA(){
    delete[] stackArray;
}

bool StackDSA::isEmpty(){
    return top==-1;
}

bool StackDSA::isFull(){
    return top==(maxSize-1);
}

void StackDSA::push(int number){
    if(isFull()){
        std::cout<<"Stack is Full!"<<std::endl;
    }else{
        stackArray[++top] = number;
    }
}

void StackDSA::pop(){
    if(isEmpty()){
        std::cout<<"Stack is Empty!"<<std::endl;
    }else{
        std::cout<<"Pop: "<<stackArray[top--]<<std::endl;
    }
}

void StackDSA::size(){
    if(isEmpty()){
        std::cout<<"Stack is Empty!"<<std::endl;
    }else {
        std::cout<<"size of the Stack: "<<top+1<<std::endl;
    }
}