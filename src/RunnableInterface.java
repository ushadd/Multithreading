 //  Multithreading can be achieved by runnable interface and in -built thread class
class Java2 implements Runnable // Runnable is interface
{
    public void run()
    {
        for (int i = 0; i < 3; i++)
        {
            System.out.println("Java1 developers");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
class React2 implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("React developers");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
public class RunnableInterface
{
    public static void main(String[] args)
    {
        Java2 j = new Java2();
        Thread t = new Thread(j); //
        t.start();
        React2 r = new React2();
        Thread t1 = new Thread(r); //  thread object is created when the start() method should work the run() which is declared inside a interface
        t1.start();
    }
}
