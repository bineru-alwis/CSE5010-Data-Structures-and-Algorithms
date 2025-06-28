public class HashTable {

    private Integer[] hashTable;
    private int size;

    public HashTable(int size){
        this.size = size;
        hashTable = new Integer[this.size];
    }

    public void add(int value){
        
    }

    public void hashTabelMethod(int[] values){
        int keyValue;
        Integer newHashTable[] = new Integer[values.length];

        for(int i=0; i<values.length; i++){
            keyValue = values[i] % values.length;
            while (newHashTable[keyValue]!=null){
                keyValue++;
            }
            newHashTable[keyValue] = values[i];
        }
        System.out.println("Hash table:");
        for (int i = 0; i < newHashTable.length; i++) {
            System.out.println(i+" - ["+newHashTable[i]+"]");
        }

        System.out.println("Hashtable Complete.");
    }


}
