# CC1_IEEE - SHRIDHARAN VK 23BCE2086 



## **Overview**  
This project implements essential **Data structure based programs using Java language**, ensuring efficiency and demonstrating a deep understanding of algorithms. The project includes:  

- **Level 0:** **Doubly Linked List** with insertion and traversal.  
- **Level 1:** **Min-Max Stack** with `push()`, `pop()`, `top()`, `getMin()`, and `getMax()`.  
- **Level 2:** **Interval Merger** to manage non-overlapping intervals dynamically.  
- **Level 3:** **Time-Based Cache** that stores key-value pairs with automatic expiration.  
  

---

## **Features**  
- **No Built-in Collections**: Avoids Java `ArrayList`, `HashMap`, etc.  
- **Custom Implementations**: All structures are built from scratch.  
- **Step-by-Step Execution**: Displays **detailed logs** for every operation.  
- **Optimized Performance**: Uses **manual memory management** and **minimal time complexity**.  

---

## **1️⃣ Level 0: Doubly Linked List Implementation**  

### **Operations Implemented**  
- **Insertion at Head**  
- **Insertion at Tail**  
- **Forward Traversal**  
- **Backward Traversal**  

### **Time & Space Complexity**  
| Operation         | Time Complexity | Space Complexity |
|------------------|----------------|------------------|
| Insert Head      | O(1)           | O(n)             |
| Insert Tail      | O(1)           | O(n)             |
| Forward Traverse | O(n)           | O(1)             |
| Backward Traverse | O(n)           | O(1)             |

### **Example Execution**  
#### **Input:**  
```java
DoublyLinkedList list = new DoublyLinkedList();
list.insertAtHead(10);
list.insertAtTail(20);
list.insertAtTail(30);
list.insertAtHead(5);
list.displayForward();
list.displayBackward();
```
#### **Output:**  
```
Inserting 10 at head...
Inserting 20 at tail...
Inserting 30 at tail...
Inserting 5 at head...
Forward Traversal: 5 -> 10 -> 20 -> 30
Backward Traversal: 30 -> 20 -> 10 -> 5
```

---

## **2️⃣ Level 1: Min-Max Stack**  

### **Operations Implemented**  
- **push(x)** → Adds an element.  
- **pop()** → Removes the top element.  
- **top()** → Retrieves the top element.  
- **getMin()** → Returns the minimum element.  
- **getMax()** → Returns the maximum element.  

### **Time & Space Complexity**  
| Operation | Time Complexity | Space Complexity |
|-----------|----------------|------------------|
| Push      | O(1)           | O(n)             |
| Pop       | O(1)           | O(n)             |
| Top       | O(1)           | O(1)             |
| GetMin    | O(1)           | O(1)             |
| GetMax    | O(1)           | O(1)             |

### **Example Execution**  
#### **Input:**  
```java
MinMaxStack stack = new MinMaxStack();
stack.push(3);
stack.push(5);
stack.push(2);
stack.push(1);
stack.push(4);
System.out.println(stack.getMin());
System.out.println(stack.getMax());
stack.pop();
System.out.println(stack.top());
```
#### **Output:**  
```
Pushing 3...
Pushing 5...
Pushing 2...
Pushing 1...
Pushing 4...
Minimum Element: 1
Maximum Element: 5
Popping element: 4
Top Element after pop: 1
```

---

## **3️⃣ Level 2: Interval Merger**  

### **Operations Implemented**  
- **addInterval(start, end)** → Adds an interval and merges overlapping ones.  
- **getIntervals()** → Retrieves the list of **non-overlapping** intervals.  

### **Time & Space Complexity**  
| Operation      | Time Complexity | Space Complexity |
|---------------|----------------|------------------|
| addInterval() | O(log n)        | O(n)             |
| getIntervals() | O(n)           | O(n)             |

### **Example Execution**  
#### **Input:**  
```java
IntervalMerger merger = new IntervalMerger();
merger.addInterval(1, 5);
merger.addInterval(6, 8);
merger.addInterval(4, 7);
System.out.println(merger.getIntervals());
```
#### **Output:**  
```
Adding interval [1,5]...
Adding interval [6,8]...
Adding interval [4,7], merging with [1,5]...
Merged Intervals: [[1,8]]
```

---

## **4️⃣ Level 3: Time-Based Cache**  

### **Operations Implemented**  
- **set(key, value, expiryTime)** → Stores key-value pair with expiration time.  
- **get(key)** → Retrieves value if not expired.  
- **Automatic Expiry Handling**  

### **Time & Space Complexity**  
| Operation       | Time Complexity | Space Complexity |
|----------------|----------------|------------------|
| set()         | O(1)            | O(n)             |
| get()         | O(n)            | O(n)             |
| cleanExpiredKeys() | O(n)       | O(n)             |

### **Example Execution**  
#### **Input:**  
```java
TimeBasedCache cache = new TimeBasedCache();
cache.set("A", 10, System.currentTimeMillis() + 5000);
cache.set("B", 20, System.currentTimeMillis() + 3000);
System.out.println(cache.get("A"));
Thread.sleep(4000);
System.out.println(cache.get("B"));
System.out.println(cache.get("A"));
```
#### **Output:**  
```
Setting key A with value 10 and expiry 5000ms...
Setting key B with value 20 and expiry 3000ms...
Retrieving key A: Value = 10
Waiting for expiry...
Retrieving key B: Expired
Retrieving key A: Value = 10
```

---

## **📌 Setup Instructions**  
### **Clone the Repository**  
```sh
git clone https://github.com/yourusername/ds-java.git
cd ds-java
```
### **Compile and Run using javac and java **  
```sh
javac *.java
java *  *denotes the class
```

---



