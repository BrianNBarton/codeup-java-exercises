import java.util.LinkedList;

public class MyHashSet {
    public static void main(String[] args) {
        System.out.println(new MyHashSet());
    }

    private final LinkedList<Integer>[] arr;
    private final int size;

    /**
     * Initialize your data structure here.
     */
    public MyHashSet() {
        this.size = 16;
        this.arr = new LinkedList[this.size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new LinkedList<>();
        }
    }

    public void add(int key) {
        if(!contains(key))
            arr[hash(key)].add(key);
    }

    public void remove(int key) {
        arr[hash(key)].remove(Integer.valueOf(key));
    }

    /**
     * Returns true if this set contains the specified element
     */
    public boolean contains(int key) {
        return arr[hash(key)].contains(key);
    }

    private int hash(int data) {
        return data % size;
    }
}
/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */