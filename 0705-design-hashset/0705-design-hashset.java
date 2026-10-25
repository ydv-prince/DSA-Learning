class MyHashSet {
    private boolean[] data;
    private static final int MAX_SIZE = 1000001;
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

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna