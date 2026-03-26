package threading;

class MyThread extends Thread
{
    public void run()
    {
        for(int i=1; i<=5; i++)
        {
            System.out.println(i);
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {

            }
        }
    }
}

public class ThreadSleepExample {
    public static void main(String[] args)
    {
        MyThread thread = new MyThread();

        thread.run();
    }

}
