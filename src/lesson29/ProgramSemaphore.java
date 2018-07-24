package lesson29;

/*
1. Parašyti programą su int skaitliuku. Programa turi sukurti tam tikrą skaičių gijų ir jas paleisti.
Kiekviena gija turi padidinti skaitliuką vienetu. Pabaigoje, turi išvesti skaitliuko reikšmę ir palyginti, ar ji sutaps su gijų skaičiumi.
Jeigu reikšmė nesutampa, pataisyti programą taip, kad ji sutaptų.
 */

import java.util.concurrent.Semaphore;

public class ProgramSemaphore {

    public static void main(String[] args) {

        Semaphore sem = new Semaphore(1);
        CommonResource res = new CommonResource();
        new Thread(new CountThread(res, sem, "Counter 1")).start();
        new Thread(new CountThread(res, sem, "Counter 2")).start();
        new Thread(new CountThread(res, sem, "Counter 3")).start();
    }
}
class CommonResource{

    int x=0;
}

class CountThread implements Runnable{

    CommonResource res;
    Semaphore sem;
    String name;
    CountThread(CommonResource res, Semaphore sem, String name){
        this.res=res;
        this.sem=sem;
        this.name=name;
    }

    public void run(){

        try{
            System.out.println(name + " waiting access");
            sem.acquire();
            res.x=1;
            for (int i = 1; i < 5; i++){
                System.out.println(this.name + ": " + res.x);
                res.x++;
                Thread.sleep(100);
            }
        }
        catch(InterruptedException e){System.out.println(e.getMessage());}
        System.out.println(name + " dismiss access");
        sem.release();
    }
}
