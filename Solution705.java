//705. Design HashSet
public class Solution705 {
    class MyHashSet {
        boolean[] data;
        private final int MAX_SIZE = 1000001;
        public MyHashSet() {
            data = new boolean[MAX_SIZE];
        }
        
        public void add(int key) {
            data[key] = true;
        }
        
        public void remove(int key) {
            data[key] = false;
        }
        
        public boolean contains(int key) {
            return data[key];
        }
    }
}
