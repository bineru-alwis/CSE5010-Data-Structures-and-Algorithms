#include "QueueDSA.h"
#include <iostream>

QueueDSA::QueueDSA(int size){
    maxSize = size;
    queueArray = new int[maxSize];
    front = 0;
    rear = 0;
    dataCount = 0;
}

QueueDSA::~QueueDSA(){
    delete[] queueArray;
}

bool QueueDSA::isEmpty(){
    return dataCount == 0;
}

bool QueueDSA::isFull(){
    return dataCount == maxSize;
}

void QueueDSA::enqueue(int number){
    if(isFull()){
        std::cout<<"Queue is Full!!!"<<std::endl;
    }else{
        queueArray[rear] = number;
        rear = (rear+1) % maxSize;
        dataCount++;
    }
}

void QueueDSA::dequeue(){
    if(isEmpty()){
        std::cout<<"Queue is Empty!!!"<<std::endl;
    }else{
        std::cout<<"Dequeue: "<<queueArray[front]<<std::endl;
        front = (front+1) % maxSize;
        dataCount--;
    }
}

void QueueDSA::sizeOfQueue(){
    std::cout<<"Size of the Queue: "<<dataCount<<std::endl;
}

void QueueDSA::peek(){
    if(isEmpty()){
        std::cout<<"Queue is Empty!!!"<<std::endl;
    }else{
        std::cout<<"Peek: "<<queueArray[front]<<std::endl;
    }
}

/* Debuggin code
void QueueDSA::printQueue(){
    if(isEmpty()){
        std::cout<<"Queue is Empty!!!"<<std::endl;
    }else{

        int index = front;
        
        for(int i=0; i<dataCount; i++){
            std::cout<<queueArray[index]<<std::endl;
            index = (index+1) % maxSize;
        }
        
        std::cout<<"The second array starts!"<<std::endl;

        for (int i = 0; i < maxSize; i++)
        {
            std::cout<<queueArray[i]<<std::endl;
        }
        
    }
}*/