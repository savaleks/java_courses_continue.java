package lesson29;

import java.util.Random;

public class ThreadsMethods {

    public static void main(String[] args) {

        Thread t1 = new Thread(new Bin("1"));
        Thread t2 = new Thread(new Bin("2"));
        Thread t3 = new Thread(new Bin("3"));
        Thread t4 = new Thread(new Bin("4"));
        Thread t5 = new Thread(new Bin("5"));
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();
//        t5.start();

//        System.out.println("Main thread started...");
//        new JThread("JThread").start();
//        System.out.println("Main thread finished...");

//        System.out.println("Main thread started...");
////        for(int i=1; i < 6; i++)
////            new JThread("JThread " + i).start();
////        System.out.println("Main thread finished...");

        Store store=new Store();
        Producer producer = new Producer(store);
        Consumer consumer = new Consumer(store);
        new Thread(producer).start();
        new Thread(consumer).start();

        System.out.println("Main thread started...");
        Runnable r = ()->{
            System.out.printf("%s started... \n", Thread.currentThread().getName());
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                System.out.println("Thread has been interrupted");
            }
            System.out.printf("%s finished... \n", Thread.currentThread().getName());
        };
        Thread myThread = new Thread(r,"MyThread");
        myThread.start();
        System.out.println("Main thread finished...");
    }
}

class Bin implements Runnable {

    int time;
    String name;
    Random r = new Random();


    public Bin(String name) {
        this.name = name;
        time = r.nextInt(999);
    }

    public void run(){
        System.out.printf("Process %s sleep %d\n", name, time);
        try {
            Thread.sleep(time);
        } catch (Exception e){}
        System.out.printf("Process %s wake up and close.\n", name);
    }
}
class JThread extends Thread {

    JThread(String name){
        super(name);
    }

    public void run(){

        System.out.printf("%s started... \n", Thread.currentThread().getName());
        try{
            Thread.sleep(500);
        }
        catch(InterruptedException e){
            System.out.println("Thread has been interrupted");
        }
        System.out.printf("%s fiished... \n", Thread.currentThread().getName());
    }
}
class Store{
    private int product=0;
    public synchronized void get() {
        while (product<1) {
            try {
                wait();
            }
            catch (InterruptedException e) {
            }
        }
        product--;
        System.out.println("Bought 1 item");
        System.out.println("Items in warehouse: " + product);
        notify();
    }
    public synchronized void put() {
        while (product>=3) {
            try {
                wait();
            }
            catch (InterruptedException e) {
            }
        }
        product++;
        System.out.println("Added 1 item");
        System.out.println("Items in warehouse: " + product);
        notify();
    }
}

class Producer implements Runnable{

    Store store;
    Producer(Store store){
        this.store=store;
    }
    public void run(){
        for (int i = 1; i < 6; i++) {
            store.put();
        }
    }
}

class Consumer implements Runnable{

    Store store;
    Consumer(Store store){
        this.store=store;
    }
    public void run(){
        for (int i = 1; i < 6; i++) {
            store.get();
        }
    }
}