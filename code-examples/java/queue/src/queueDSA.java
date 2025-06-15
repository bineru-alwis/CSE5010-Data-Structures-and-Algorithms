import java.util.Arrays;

public class queueDSA {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int dataCount;

    //constructor
    public queueDSA (int size){
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = 0;
        dataCount=0;
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
    public void enqueue(int number){
        if(isFull()){
            System.out.println("Queue is Full!");
        }else{
            queueArray[rear] = number;
            dataCount++;

            rear = (rear+1) % maxSize; //use to wrap the front and rear back to 0 when they hit maxSize
        }
    }

    //method to remove element from the queue (removes from the front)
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty!");
        }else{

            dataCount--;
            System.out.println("Dequeue Value: "+queueArray[front]);
            front = (front+1) % maxSize;
        }
    }

    //method to peek the front element
    public void peek(){
        System.out.println(queueArray[front]);
    }

    //method to get the currant size of the queue
    public void size(){
        System.out.println(dataCount);
    }

    /*
    Debug codes
    //method to print Array
    public void printArray(){
        System.out.println("The Array: "+(Arrays.toString(queueArray)));
    }

    public void peek(){
        System.out.println("Front: "+front);
        System.out.println("Rear: "+rear);
        System.out.println("Data Count: "+dataCount);

    }
     */
}
