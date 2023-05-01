
public class KVPair {
	int key;
	int val;
	KVPair next;
	KVPair prev;
	KVPair(int key, int val) {
		this.key = key;
		this.val = val;
		this.next = null;
		this.prev = null;
	}
}
