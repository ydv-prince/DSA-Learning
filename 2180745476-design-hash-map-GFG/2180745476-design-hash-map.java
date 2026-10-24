class MyHashMap {

    private int[] data;
    MyHashMap() {
        data = new int[1000001];
        Arrays.fill(data, -1);
    }

    /** value will always be non-negative. */
    void put(int key, int value) {
        data[key] = value;
    }

    /**
     * Returns the value to which the specified key is mapped, or -1 if this map
     * contains no mapping for the key
     */
    int get(int key) {
        return data[key];
    }

    /**
     * Removes the mapping of the specified value key if this map contains a mapping
     * for the key
     */
    void remove(int key) {
        data[key] = -1;        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna