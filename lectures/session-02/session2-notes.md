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
## Linear Data Structures
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

---
## Sorting Algorithms
Sorting refers to arranging data in a particular format. Sorting algorithm specifies the way to arrange data in a particular order. Most common orders are numerical or lexicographical order.
### Bubble Sort
Bubble sort is a simple sorting algorithm. This sorting algorithm is comparison based algorithm in which each pair of adjacent elements is compared and elements are swapped if they are not in order. This algorithm is not suitable for large data sets as its average and worst case complexity are of O(n2) where n are no. of items

**Usage Limitations**
- Inefficient for large datasets (Time complexity: O(n²))
- Involves many swap operations, increasing memory write overhead
- Not suitable for real-time or performance-critical systems

**Real-World Applications**
- Small clinics: Sorting 10–15 patient files by appointment time manually
- Freelancing: Organizing 8–12 invoices by payment amount in a spreadsheet
- Team stand-ups: Prioritizing 5–10 tasks on a whiteboard by estimated completion time
- IoT devices: Sorting 10–20 sensor readings on low-power embedded systems
- Classroom use: Arranging student presentation order manually based on duration

### Selection Sort
Selection Sort works by repeatedly selecting the smallest (or largest) element from the unsorted portion and moving it to the correct position.
It divides the list into a sorted and an unsorted part, growing the sorted portion one element at a time.

**Usage Limitations**
- Always performs O(n²) comparisons, regardless of initial order
- Inefficient for large datasets despite fewer swaps
- Not stable by default (may change the order of equal elements)
- Less cache-friendly compared to divide-and-conquer sorts
- Not ideal for real-time, high-performance systems

**Real-World Applications**
- Sorting a list of assignments by deadline for planning
- Organizing a playlist by song length for quick selections
- Arranging books by height on a small shelf
- Ordering small batches of quiz scores in a classroom
- Sorting expiry dates in a small grocery inventory

### Insertion Sort
### Merge Sort
