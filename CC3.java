class TimeBasedCache {
    class Node {
        String key;
        String value;
        long expiry;
        Node next;
        Node(String k, String v, long e, Node n) { key = k; value = v; expiry = e; next = n; }
    }
    private Node head;
    private long currentTime = 0;
    
    void set(String key, String value, long expiryTime) {
        cleanExpiredKeys();
        long expiry = currentTime + expiryTime;
        System.out.println("Setting key: " + key + " with expiry in " + expiryTime + " seconds");
        head = new Node(key, value, expiry, head);
    }
    
    String get(String key) {
        cleanExpiredKeys();
        Node temp = head;
        while (temp != null) {
            if (temp.key.equals(key)) {
                System.out.println("Retrieved key: " + key + " -> " + temp.value);
                return temp.value;
            }
            temp = temp.next;
        }
        System.out.println("Key not found or expired: " + key);
        return null;
    }
    
    void cleanExpiredKeys() {
        while (head != null && head.expiry < currentTime) {
            System.out.println("Removing expired key: " + head.key);
            head = head.next;
        }
        if (head == null) return;
        Node prev = head, temp = head.next;
        while (temp != null) {
            if (temp.expiry < currentTime) {
                System.out.println("Removing expired key: " + temp.key);
                prev.next = temp.next;
            } else {
                prev = temp;
            }
            temp = temp.next;
        }
    }
    
    void incrementTime(long seconds) {
        currentTime += seconds;
    }
}

public class CC3 {
    public static void main(String[] args) {
        TimeBasedCache cache = new TimeBasedCache();
        cache.set("A", "Apple", 2);
        cache.set("B", "Banana", 4);
        cache.get("A");
        cache.incrementTime(3);
        cache.get("A");
        cache.get("B");
        cache.incrementTime(2);
        cache.get("B");
    }
}
