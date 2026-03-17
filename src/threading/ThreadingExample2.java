package threading;

class ThreadA extends Thread
{
    public void run()
    {
        System.out.println("Thread A is running");
    }
}

class ThreadB extends Thread
{
    public void run()
    {
        System.out.println("Thread B is running");
    }
}
class ThreadC extends Thread
{
    public void run()
    {
        System.out.println("Thread C is running");
    }
}

class ThreadingExample2
{
    public static void main(String[] args)
    {
        ThreadA a = new ThreadA();
        ThreadB b = new ThreadB();
        ThreadC c = new ThreadC();

        a.start();
        b.start();
        c.start();

    }
}