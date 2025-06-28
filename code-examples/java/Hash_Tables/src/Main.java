//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        int[] hashTabel1 = new int[5];
        int[] hashTabel2 = new int[7];
        int[] values1 = {23,17,19,25,36};
        int[] values2 = {21,42,33,56,77,99,81};


        HashTable myHashTabel = new HashTable();

        myHashTabel.hashTabelMethod(values2);
        myHashTabel.hashTabelMethod(values1);

    }
}