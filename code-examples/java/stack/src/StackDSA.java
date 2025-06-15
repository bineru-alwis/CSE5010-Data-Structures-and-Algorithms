public class StackDSA {
    private final int maxSize; //Declaring the int to hold the Size of the Stack
    private final int[] stackArray; //declaring the integer type array to hold the stack
    private int top; //Declaring the int to track the top position stack

    //constructor
     public StackDSA(int size){
         maxSize = size; //Initializing the size of the Array
         stackArray = new int[maxSize]; //Initializing the stack with the max size
         top = -1;
     }

     //method to see if the stack is empty
     public boolean isEmpty(){
         return (top == -1);
     }

     //method to see if the stack is full
     public boolean isFull(){
         return top == (maxSize -1);
     }

     //method to push values to the stack
     public void push(int number){
         //first check if the stack is full. If full send a message saying full.
         // if not, increment the top by 1 and add the number to top of the stack;
         if(isFull()){
             System.out.println("Stack is full,");
         }else{
             stackArray[++top] = number;
         }
     }

     //method to pop values from the stack
     public int pop(){
         //first check if the stack is empty. If empty send a message saying empty.
         // if not, return the top stack number and decrement the value of the top by 1.
         if(isEmpty()){
             System.out.println("Stack is Empty.");
             return -1;
         }else{
             return stackArray[top--];
         }
     }

     //method to peek the top value of the stack
    public int peek(){
         if(isEmpty()){
             System.out.println("Stack is Empty.");
             return -1;
         }else{
             return stackArray[top];
         }
    }

    //method to check the currant size of the Stack
    public int size(){
         return top+1; //have to +1 because the array index start from 0.
    }
}
