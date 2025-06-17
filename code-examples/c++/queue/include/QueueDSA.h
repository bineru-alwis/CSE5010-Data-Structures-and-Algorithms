#ifndef QUEUEDSA_H
#define QUEUEDSA_H

class QueueDSA{

    private:
        int front;
        int rear;
        int dataCount;
        int maxSize;
        int* queueArray;

    public:
        QueueDSA(int size);
        ~QueueDSA();
        bool isEmpty();
        bool isFull();
        void enqueue(int number);
        void dequeue();
        void sizeOfQueue();
        void peek();
        void printQueue();
};

#endif