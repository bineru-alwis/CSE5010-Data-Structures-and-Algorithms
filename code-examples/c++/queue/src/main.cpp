#include <iostream>
#include "QueueDSA.h"
using namespace std;

int main() {

  QueueDSA myQueue(5);

  myQueue.enqueue(1);
  myQueue.enqueue(2);
  myQueue.enqueue(3);
  myQueue.enqueue(4);
  myQueue.enqueue(5);
  
  myQueue.sizeOfQueue();

  myQueue.peek();
  myQueue.dequeue();
  myQueue.dequeue();

  myQueue.enqueue(35);
  myQueue.enqueue(45);

  myQueue.peek();

  myQueue.printQueue();

  return 0;
}