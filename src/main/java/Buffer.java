import java.util.Vector;

public class Buffer {
    private static final int MAX_SIZE = 10;
    private Vector<Integer> buffer;

    public Buffer() {
        buffer = new Vector<>(MAX_SIZE);
    }

    public synchronized void add (int item) throws InterruptedException {
        while (isFull()) {
            System.out.println("Buffer lleno. Productor esperando...");
            wait();
        }
        buffer.add(item);
        notifyAll();
    }

    public synchronized int remove() throws InterruptedException {
        while(isEmpty()) {
            System.out.println("Buffer vacío. Consumidor esperando...");
            wait();
        }
        int item = buffer.remove(0);
        notifyAll();
        return item;
    }

    public boolean isEmpty(){
        return buffer.isEmpty();
    }

    public boolean isFull() {
        return buffer.size() == MAX_SIZE;
    }

    public int size() {
        return buffer.size();
    }
}
