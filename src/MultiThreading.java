class Java1 extends Thread // if the class extends thread means the run() must and should be inside the class of thread
{
    public void run() // defautly run() method inside the Thread class
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Java developers");
            try{
                Thread.sleep(10000); // if the sleep() is used then exception should be handled either by try,catch or throws
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
class React1 extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("React developers");
            try{
                Thread.sleep(3000);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
public class MultiThreading
{
    public static void main(String[] args)
    {
        Java1 j = new  Java1();
        React1 r = new React1();
        j.start(); // when run() method is used in thread class, should not call by method name
        r.start(); // start() will work only for run()
    }
}

