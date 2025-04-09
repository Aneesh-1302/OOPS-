package L8;

interface Series {
    int getNext();
    void reset();
    void setStart(int x);
}

class ByTwos implements Series {
    private int start, val;
    public ByTwos() { start = 0; val = 0; }
    @Override public int getNext() { val += 2; return val; }
    @Override public void reset() { val = start; }
    @Override public void setStart(int x) { start = x; val = x; }
}

public class L8P2 {
    public static void main(String[] args) {
        ByTwos obj = new ByTwos();
        obj.setStart(2);
        System.out.println(obj.getNext());
        System.out.println(obj.getNext());
        obj.reset();
        System.out.println(obj.getNext());
    }
}
