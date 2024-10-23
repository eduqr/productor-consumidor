public class Producer extends Thread {
    private Buffer buffer;
    private static final int TOTAL_ITEMS = 500;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try{
            for(int i = 0; i < TOTAL_ITEMS; i++) {
                buffer.add(i);
                System.out.println("Productor creó item: " + "\t\t" + i + "\t(Elementos en buffer: " + buffer.size() + ")");
                Thread.sleep(20);
            }
        } catch(InterruptedException e) {
            System.out.println("Error en Productor");
        }
    }

}
