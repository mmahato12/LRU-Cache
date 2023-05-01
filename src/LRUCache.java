import java.util.HashMap;

public class LRUCache {
	int capacity;
	HashMap <Integer, KVPair> mp;
	KVPair head;
	KVPair tail;
	LRUCache(int capacity) {
		this.mp = new HashMap <>();
		this.capacity = capacity;
		head = new KVPair(0, 0);
		tail = new KVPair(0, 0);
		head.next = tail;
		tail.prev = head;
    }
	
	void insert(KVPair currPair) {
		currPair.next = head.next;
		head.next.prev = currPair;
		head.next = currPair;
		currPair.prev = head;
		mp.put(currPair.key, currPair);
	}
	
	void remove(KVPair currKey) {
		mp.remove(currKey.key);
		currKey.next.prev = currKey.prev;
		currKey.prev.next = currKey.next;
	}
	
	public int get(int key) {
		if(mp.getOrDefault(key, null) == null)
			return -1;
		KVPair currKey = mp.get(key);
		remove(currKey);
		insert(currKey);
		return currKey.val;
	}
	
	public void put(int key, int value) {
		if(mp.getOrDefault(key, null) != null)
			remove(mp.get(key));
		
		if(mp.size() == capacity)
			remove(tail.prev);
		insert(new KVPair(key, value));
	}
}
