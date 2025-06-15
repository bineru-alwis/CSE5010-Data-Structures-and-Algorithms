#ifndef STACKDSA_H
#define STACKDSA_H

class StackDSA{
    private:
        int maxSize;
        int top;
        int* stackArray;
    
    public:
        StackDSA(int size);
        ~StackDSA();
        bool isEmpty(); //check if the stack is empty
        bool isFull(); //check if the stack is full
        void push(int number); //insert a number to the stack
        void pop(); //take out a number from the stack
        void size(); //get the currant size of the stack
};

#endif