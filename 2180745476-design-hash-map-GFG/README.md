# [Design HashMap](https://www.geeksforgeeks.org/problems/design-hashmap/1)
## Easy
Design a HashMap&nbsp;without using any built-in hash table libraries.To be specific, your design should include these functions:put(key, value)&nbsp;:&nbsp;Insert a (key, value) pair into the HashMap. If the value already exists in the HashMap, update the value.get(key): Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key.remove(key) :&nbsp;Remove the mapping for the value key if this map contains the mapping for the key.&nbsp;Examples:Input:
n = 8
put(1,1)&nbsp;
put(2,2)
get(1)&nbsp;
get(3)
put(2,1)&nbsp;
get(2)
remove(2)
get(2)
Output: 
1
-1
1
-1
Explanation: MyHashMap hashMap = new MyHashMap();
hashMap.put(1, 1);// Now the value of key 1 is 1. &nbsp; &nbsp; &nbsp; &nbsp;
hashMap.put(2, 2);// Now the value of key 2 is 2. 
hashMap.get(1);// returns 1
hashMap.get(3);// returns -1 (not found)
hashMap.put(2, 1);// update the existing value of key 2 to 1.
hashMap.get(2);// returns 1 
hashMap.remove(2);// remove the mapping for 2.
hashMap.get(2);// returns -1 (not found)Input:
n = 3
put(1,1)&nbsp;
put(2 2)
get(2)
Output: 2
Explanation:
hashMap.put(1,1)// Now the value of key 1 is 1.
hashMap.put(2,2)// Now the value of key 2 is 2.
hashMap.get(2)// Returns 2. &nbsp; &nbsp;
Constraints:1 &lt;= q&nbsp;&lt;= 1041 &lt;= key&nbsp;&lt;= 104