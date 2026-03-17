package threading;

class ThreadingExample extends Thread
{
    public static void main(String[] args)
    {
        ThreadingExample thread = new ThreadingExample();
        thread.start();
        System.out.println("This code is outside of the thread");
    }

    public void run()
    {
        System.out.println("This code is running inside thread");
    }
}