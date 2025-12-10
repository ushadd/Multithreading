class Java
{
    public void demo()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Java developers");
            try{
                Thread.sleep(2000);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
class React
{
    public void demo()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("React developers");
            try{
                Thread.sleep(2000);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
public class ThreadSleep
{
    public static void main(String[] args)
    {
        Java j = new  Java();
        React r = new React();
        j.demo();
        r.demo();
    }
}
