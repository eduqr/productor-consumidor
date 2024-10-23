public class Consumer extends Thread {
    private Buffer buffer;
    private static final int TOTAL_ITEMS = 500;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
          for(int i = 0; i < TOTAL_ITEMS; i++) {
              int item = buffer.remove();
              System.out.println("Consumidor consumió item: " + "\t" + item + "\t(Elementos en buffer " + buffer.size() + ")");
              Thread.sleep(21);
          }
        } catch(InterruptedException e) {
            System.out.println("Error en Consumidor");
        }
    }
}
