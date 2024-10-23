public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Productor y consumidor");
        Buffer buffer = new Buffer();
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();

        producer.join();
        consumer.join();

        System.out.println("Productor y consumidor ejecutado sin problemas");
    }
}

