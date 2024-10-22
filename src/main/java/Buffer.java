import java.util.Vector;

public class Buffer {
    private static final int MAX_SIZE = 10;
    private Vector<Integer> buffer;

    public Buffer() {
        buffer = new Vector<>(MAX_SIZE);
    }

    public void add (int item) {
        buffer.add(item);
    }

    public void remove(int index) {
        buffer.remove(index);
    }

    public int getElementAt(int index) {
        return buffer.get(index);
    }

    public boolean isFull() {
        return buffer.size() == MAX_SIZE;
    }
}
