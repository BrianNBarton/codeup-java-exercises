//import org.w3c.dom.ls.LSOutput;
//
//import java.util.LinkedList;
//
//
//public class MyHashMap {
//
//}
//
//    private final LinkedList<Entry>[] arr;
//    private final int size;
//
//    /**
//     * Initialize your data structure here.
//     */
//    public MyHashMap() {
//        this.size = 16;
//        this.arr = new LinkedList[this.size];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = new LinkedList<>();
//        }
//    }
//
//    public void put(int key, int value) {
//        int index = arr[hash(key)].indexOf(new Entry(key));
//        if (index >= 0) {
//            arr[hash(key)].get(index).val = value;
//        } else {
//            arr[hash(key)].add(new Entry(key, value));
//        }
//    }
//
//    public int get(int key) {
//        int index = arr[hash(key)].indexOf(new Entry(key));
//        return index >= 0 ? arr[hash(key)].get(index).val : -1;
//    }
//
//    public void remove(int key) {
//        arr[hash(key)].remove(new Entry(key));
//    }
//
//    /**
//     * Returns true if this set contains the specified element
//     */
//    private boolean contains(int key) {
//        return arr[hash(key)].contains(new Entry(key));
//    }
//
//    private int hash(int data) {
//        return data % size;
//    }

