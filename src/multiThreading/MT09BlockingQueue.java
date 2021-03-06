package multiThreading;

import java.util.concurrent.ArrayBlockingQueue;

public class MT09BlockingQueue {
    static public int sayac = 0;

    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue<Integer> kuyruk = new ArrayBlockingQueue<>(10);

        Uretici uretici = new Uretici(kuyruk);
        Thread ureticiThread = new Thread(uretici);

        Tuketici tuketici = new Tuketici(kuyruk);
        Thread tuketiciThread = new Thread(tuketici);

        ureticiThread.start();
        tuketiciThread.start();
    }

}

class Uretici implements Runnable {
    private ArrayBlockingQueue<Integer> kuyruk;

    public Uretici(ArrayBlockingQueue<Integer> kuyruk) {
        this.kuyruk = kuyruk;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                kuyruk.put(++MT09BlockingQueue.sayac);
                System.out.println("Sayac'in degeri kuyruga eklendi: " + MT09BlockingQueue.sayac);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Tuketici implements Runnable {
    private ArrayBlockingQueue<Integer> kuyruk;

    public Tuketici(ArrayBlockingQueue<Integer> kuyruk) {
        this.kuyruk = kuyruk;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(5000);
                kuyruk.take();
                MT09BlockingQueue.sayac--;
                System.out.println("Sayac'in degeri kuyruktan cikarildi: " + MT09BlockingQueue.sayac);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}