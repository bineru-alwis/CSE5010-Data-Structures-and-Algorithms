public class GenericStackClass<T> {
    public int maxSize;
    public int top;
    public T[] stackArray;

    //Constructor
    @SuppressWarnings("unchecked")
    public GenericStackClass(int size){
        maxSize = size;
        stackArray = (T[]) new Object[size];
        top=-1;
    }

    //method to check if the stack is empty
    public boolean isEmpty(){
        return top == -1;
    }

    //method to check if the stack is full
    public boolean isFull(){
        return top == (maxSize-1);
    }

    //method to push items
    public void push(T element){
        if(isFull()){
            System.out.println("Stack is Full!");
        }else{
            stackArray[++top] = element;
        }
    }

    //method to pop items
    public void pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty!");
        }else{
            System.out.println(stackArray[top--]);
        }
    }

    //method to peek the last element
    public void peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty!");
        }else{
            System.out.println("Peek: "+stackArray[top]);
        }
    }

    //method to get the size of the stack
    public void size(){
        System.out.println("Size of the Stack: "+(top+1));
    }
}
