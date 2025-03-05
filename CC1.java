class MinMaxStack {
    class Node {
        int value, min, max;
        Node next;
        Node(int v, int mn, int mx, Node n) { value = v; min = mn; max = mx; next = n; }
    }
    private Node top;
    
    void push(int x) {
        if (top == null) {
            top = new Node(x, x, x, null);
            System.out.println("Pushed: " + x + " (Min: " + x + ", Max: " + x + ")");
        } else {
            top = new Node(x, Math.min(x, top.min), Math.max(x, top.max), top);
            System.out.println("Pushed: " + x + " (Min: " + top.min + ", Max: " + top.max + ")");
        }
    }
    
    void pop() {
        if (top != null) {
            System.out.println("Popped: " + top.value);
            top = top.next;
        } else {
            System.out.println("Stack is empty");
        }
    }
    
    int top() {
        if (top == null) {
            System.out.println("Top: Stack is empty");
            return -1;
        }
        System.out.println("Top: " + top.value);
        return top.value;
    }
    
    int getMin() {
        if (top == null) {
            System.out.println("Min: Stack is empty");
            return -1;
        }
        System.out.println("Min: " + top.min);
        return top.min;
    }
    
    int getMax() {
        if (top == null) {
            System.out.println("Max: Stack is empty");
            return -1;
        }
        System.out.println("Max: " + top.max);
        return top.max;
    }
}

public class CC1 {
    public static void main(String[] args) {
        MinMaxStack stack = new MinMaxStack();
        stack.push(3);
        stack.push(5);
        stack.push(2);
        stack.push(1);
        stack.push(4);
        stack.getMin();
        stack.getMax();
        stack.top();
        stack.pop();
        stack.top();
        stack.getMin();
        stack.getMax();
    }
}
