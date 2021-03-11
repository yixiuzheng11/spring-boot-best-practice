package cn.javastack;


import java.util.concurrent.TimeUnit;

public class Test {
    private volatile static int a = 1;
    public static void main(String[] args) {
        Thread threadA = new Thread() {
            @Override
            public void run() {
                int temp = a;
                while(a<5) {
                    System.out.println("threadA----"+a);
                }
            }
        };
        threadA.start();
        Thread threadB = new Thread() {
            @Override
            public void run() {
                while(a<5) {
                    a++;
                    System.out.println("threadB----"+a);
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        threadB.start();
    }
}
