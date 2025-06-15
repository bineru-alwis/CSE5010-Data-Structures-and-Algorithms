public class GenericQueueClass<T> {
    private T[] queueArray;
    private int maxSize;
    private int front;
    private int rear;
    private int dataCount;

    //Constructor
    @SuppressWarnings("unchecked")
    public GenericQueueClass(int size){
        maxSize = size;
        queueArray = (T[]) new Object[maxSize];
        front = 0;
        rear = 0;
        dataCount = 0;
    }

    //method to check if the queue is empty
    public boolean isEmpty(){
        return dataCount == 0;
    }

    //method to check if the queue is full
    public boolean isFull(){
        return dataCount == maxSize;
    }

    //method to add to the queue (adds element at the rear)
    public void enqueue(T number){
        if(isFull()){
            System.out.println("The Queue is Full!");
        }else{
            queueArray[rear] = number;
            rear = (rear+1) % maxSize;
            dataCount++;
        }
    }

    //method to remove element from the queue (removes from the front)
    public void dequeue(){
        if(isEmpty()){
            System.out.println("The Queue is Empty!");
        }else{
            System.out.println("Dequeue: "+queueArray[front]);
            front = (front+1) % maxSize;
            dataCount--;
        }
    }

    //method to peek the front element
    public void peek(){
        System.out.println("Peek now: "+queueArray[front]);
    }

    //method to get the currant size of the queue
    public void size(){
        System.out.println("Queue size: "+dataCount);
    }
}
