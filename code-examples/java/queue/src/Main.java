//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("First Queue");
        QueueDSA myQueue = new QueueDSA(5);

        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        myQueue.enqueue(5);
        myQueue.size();

        myQueue.dequeue();
        myQueue.size();
        myQueue.peek();

        System.out.println(" ");
        System.out.println("Second Queue:");
        GenericQueueClass<String> mySecondQueue = new GenericQueueClass<>(5);
        mySecondQueue.enqueue("Sri Lanka");
        mySecondQueue.enqueue("India");
        mySecondQueue.enqueue("USA");
        mySecondQueue.enqueue("Kuwait");
        mySecondQueue.enqueue("Australia");
        mySecondQueue.size();

        mySecondQueue.dequeue();
        mySecondQueue.size();
        mySecondQueue.peek();

    }
}