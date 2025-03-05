class IntervalMerger {
    class Interval {
        int start, end;
        Interval next;
        Interval(int s, int e) { start = s; end = e; }
    }
    private Interval head;
    
    void addInterval(int start, int end) {
        System.out.println("Adding interval: [" + start + ", " + end + "]");
        Interval newInterval = new Interval(start, end);
        if (head == null) {
            head = newInterval;
            return;
        }
        Interval prev = null, curr = head;
        while (curr != null && curr.end < start) {
            prev = curr;
            curr = curr.next;
        }
        while (curr != null && curr.start <= end) {
            start = Math.min(start, curr.start);
            end = Math.max(end, curr.end);
            curr = curr.next;
        }
        newInterval.start = start;
        newInterval.end = end;
        newInterval.next = curr;
        if (prev == null) head = newInterval;
        else prev.next = newInterval;
    }
    
    void getIntervals() {
        System.out.print("Current Intervals: ");
        Interval temp = head;
        while (temp != null) {
            System.out.print("[" + temp.start + ", " + temp.end + "] ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class CC2  {
    public static void main(String[] args) {
        IntervalMerger im = new IntervalMerger();
        im.addInterval(1, 5);
        im.getIntervals();
        im.addInterval(6, 8);
        im.getIntervals();
        im.addInterval(4, 7);
        im.getIntervals();
    }
}
