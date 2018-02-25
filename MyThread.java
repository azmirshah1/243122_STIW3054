package MyThread;

class MyThread extends Thread {

    public void run() {
        System.out.println("running...");
        System.out.println("Code has been modified by");
        System.out.println("Azmir Shah");
    }

    public static void main(String args[]) {
        MyThread t1 = new MyThread();
        System.out.println("Name of t1:" + t1.getName());
        System.out.println("id of t1:" + t1.getId());

        t1.start();

        t1.setName("STIW3054");
        System.out.println("After changing name of t1:" + t1.getName());
    }
}
