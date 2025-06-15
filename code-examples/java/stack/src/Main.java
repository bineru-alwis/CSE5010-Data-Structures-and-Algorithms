//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*StackDSA myStack = new StackDSA(10);

        myStack.push(10);
        myStack.push(20);
        myStack.push(15);
        myStack.push(199);
        myStack.push(69);
        myStack.push(376);
        myStack.push(13);
        myStack.push(555);
        myStack.push(795);
        myStack.push(169);
        myStack.push(1156);
        myStack.push(7788);

        System.out.println("Currant top value of the stack: "+myStack.peek());
        System.out.println("Currant size of the stack: "+myStack.size());

        System.out.println("Pop the top value: "+myStack.pop());
        System.out.println("Currant size of the stack: "+myStack.size());
        System.out.println("Currant top value of the stack: "+myStack.peek());*/

        GenericStackClass <Integer> myStack = new GenericStackClass<>(10);

        myStack.push(10);
        myStack.push(20);
        myStack.push(15);
        myStack.push(199);
        myStack.push(69);
        myStack.push(376);
        myStack.push(13);
        myStack.push(555);
        myStack.push(795);
        myStack.push(169);
        myStack.push(1156);
        myStack.push(7788);

        myStack.peek();
        myStack.size();
        myStack.pop();
        myStack.size();
        myStack.peek();



    }
}