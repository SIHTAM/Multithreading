public class CustomThread extends Thread{
    String name;
    Blubb blubb;
    boolean flag;
    /*Integer counter;*/

    CustomThread(String s, Blubb b, boolean b1) {
        this.name = s;
        blubb = b;
        flag = b1;
        /*this.counter = counter;*/
    }


    public void run(){
        /*System.out.println("Starte Thread " + name);
        synchronized (counter) {
        for(int i = 0; i < 5; i++) {

                try {
                    Thread.sleep(1000);
                    System.out.println(counter++);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }*/
        System.out.println("Starte Thread " + name);
        for(int i = 0; i < 5; i++)
        {
            if(flag)
            {
                blubb.first();
            }
            else
                {
                    blubb.second();
                }
        }
        System.out.println("Beende Thread " + name);
    }
}
