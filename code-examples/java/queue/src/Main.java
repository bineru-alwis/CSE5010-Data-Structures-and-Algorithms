//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        queueDSA myQueue = new queueDSA(5);

        myQueue.printArray();

        myQueue.enqueue(1);
        myQueue.printArray();
        myQueue.enqueue(2);
        myQueue.printArray();
        myQueue.enqueue(3);
        myQueue.printArray();
        myQueue.enqueue(4);
        myQueue.printArray();
        myQueue.enqueue(5);
        myQueue.printArray();

        System.out.println("Queue: 1, 2, 3, 4, 5");

        System.out.println(" ");
        System.out.println("Dequeue should be 1");
        myQueue.dequeue();
        myQueue.printArray();
        System.out.println("Queue: 2, 3, 4, 5");
        myQueue.peek();

        System.out.println(" ");
        System.out.println("Adding 25 to the Array.");
        myQueue.enqueue(25);
        myQueue.printArray();
        myQueue.peek();

        System.out.println(" ");
        System.out.println("Dequeue should be 2");
        myQueue.dequeue();
        myQueue.printArray();
        System.out.println("Queue: 3, 4, 5, 25");
        myQueue.peek();

        System.out.println(" ");
        System.out.println("Dequeue should be 3");
        myQueue.dequeue();
        myQueue.printArray();
        System.out.println("Queue: 4, 5, 25");
        myQueue.peek();

        System.out.println(" ");
        System.out.println("Adding 35 to the Array.");
        myQueue.enqueue(35);
        myQueue.printArray();
        myQueue.peek();

        System.out.println(" ");
        System.out.println("Dequeue should be 4");
        myQueue.dequeue();
        myQueue.printArray();
        System.out.println("Queue: 5, 25, 35");
        myQueue.peek();

        System.out.println(" ");
        System.out.println("Dequeue should be 5");
        myQueue.dequeue();
        myQueue.printArray();
        System.out.println("Queue: 25, 35");
        myQueue.peek();

        System.out.println(" ");
        System.out.println("Dequeue should be 25");
        myQueue.dequeue();
        myQueue.printArray();
        System.out.println("Queue: 35");
        myQueue.peek();

        System.out.println(" ");
        System.out.println("Dequeue should be 35");
        myQueue.dequeue();
        myQueue.printArray();
        System.out.println("Queue: ");
        myQueue.peek();

        System.out.println(" ");
        System.out.println("Dequeue should be Empty");
        myQueue.dequeue();
        myQueue.printArray();
        System.out.println("Queue: ");
        myQueue.peek();

        System.out.println(" ");
        System.out.println("Dequeue should be Empty");
        myQueue.dequeue();
        myQueue.printArray();
        System.out.println("Queue: ");
        myQueue.peek();


        myQueue.enqueue(1);
        myQueue.printArray();
        myQueue.enqueue(2);
        myQueue.printArray();
        myQueue.enqueue(3);
        myQueue.printArray();
        myQueue.enqueue(4);
        myQueue.printArray();
        myQueue.enqueue(5);
        myQueue.printArray();

        System.out.println(" ");
        System.out.println("Dequeue should be 1");
        myQueue.dequeue();
        myQueue.printArray();
        System.out.println("Queue: 2, 3, 4, 5");
        myQueue.peek();

        myQueue.enqueue(105);
        myQueue.printArray();

        for(int i=0; i<5; i++){
            myQueue.dequeue();
        }

        System.out.println(" ");
        myQueue.enqueue(1);
        myQueue.printArray();
        myQueue.enqueue(2);
        myQueue.printArray();
        myQueue.enqueue(3);
        myQueue.printArray();
        myQueue.enqueue(4);
        myQueue.printArray();
        myQueue.enqueue(5);
        myQueue.printArray();

    }
}