package by.bntu.fitr.povt.multithreadingCommunication.waitAndNotify;

public class Notifier implements Runnable {
 
    private Message msg;
    private Thread thread;

    Message m = new Message("d");
    
    public Notifier(Message msg) {
        this.msg = msg;
        thread = new Thread(this, "notifier");
        thread.start();
    }
 
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " стартовал");
        try {
            Thread.sleep(3000);
            //Thread.interrupted();
            synchronized (msg) {
                msg.setMsg(name + " поток Notifier отработал");
                msg.notify();
                System.out.println("yes");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
//    @Override
//    public void run() {
//       n();
//    }
//    
//    public  synchronized void n() {
//        String name = Thread.currentThread().getName();
//        System.out.println(name + " стартовал");
//        try {
//            Thread.sleep(1000);
//
//                msg.setMsg(name + " поток Notifier отработал");
//                msg.notify();
//                // msg.notifyAll();
//
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
    
    
}
