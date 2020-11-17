
public class Blubb {
    boolean flag = false;
    boolean flag2 = true;

    public synchronized void first() {
        if (flag2) {
            try {
                wait();
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        }
        if (flag) {
            try {
                wait();
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        }
        System.out.println("ich bin der erste");
        flag2 = true;
        flag = true;
        notify(); //Deadlock
    }

    public synchronized void second() {
        if (!flag2) {
            try {
                wait();
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        }
            if (!flag) {
                try {
                    wait();
                } catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }

            }
            System.out.println("ich bin der zweite");
            flag2 = false;
            flag2 = false;
            notify();

        }
}