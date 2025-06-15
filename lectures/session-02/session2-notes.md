Did not give any notes to write down

# Topics discussed in the class

### Linear Data Structures
Discussed and coded below two data Structures and tested them in java. Notes for these two are not available in the lectures notes PDF lecturer gave.
- Stack
- Qeue

### Sorting Algorithms
Discussed below two sorting Algorithms. Showed us the java code in the presentation but we did not coded or tested the code in class. Codes and detailed explanation are available in the PDF lecturer gave.
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

### Qeue
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
