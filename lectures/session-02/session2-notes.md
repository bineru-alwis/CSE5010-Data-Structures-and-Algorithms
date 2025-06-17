Did not give any notes to write down

# Topics discussed in the class

### Linear Data Structures
Discussed and coded the following two data structures and tested them in Java. Notes for these are not available in the lecture notes PDF provided by the lecturer:
- Stack
- Queue

### Sorting Algorithms
Discussed the following sorting algorithms. The lecturer showed us the Java code during the presentation, but we did not code or test them in class. The code and detailed explanations are available in the PDF provided by the lecturer:
- Bubble Sort
- Selection Sort
- Insertion Sort
- Merge Sort

---

**My Notes**

### Stack
https://www.tutorialspoint.com/dsa_using_java/dsa_using_java_stack.htm

- Stack is kind of data structure which allows operations on data only at one end.
- It allows access to the last inserted data only.
- Stack is also called LIFO (Last In First Out) data structure and Push and Pop operations are related in such a way that only last item pushed (added to stack) can be popped (removed from the stack).

Basic Operations
Following are the primary operations of a stack which are following.
- Push − push an element at the top of the stack.
- Pop − pop an element from the top of the stack.
- Peek − get the top element of the stack.
- isFull − check if stack is full.
- isEmpty − check if stack is empty.
- Size - check the size of the stack.

### Queue
https://www.tutorialspoint.com/dsa_using_java/dsa_using_java_queue.htm

Queue is kind of data structure similar to stack with primary difference that the first item inserted is the first item to be removed (FIFO - First In First Out) where stack is based on LIFO, Last In First Out principal.

```
Uses Circular Logic in enqueue() and dequeue() to wrap rear and front back to 0 when they hit maxSize.
rear = (rear+1) % maxSize;
front = (front+1) % maxSize;
```

Basic Operations

- enqueue − add an item to the rear of the queue.
- dequeue − remove an item from the front of the queue.
- Peek − get the element at front of the queue.
- isFull − check if queue is full.
- isEmpty − check if queue is empty.
