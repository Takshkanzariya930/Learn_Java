class Stack
{
    private int[] stack = new int[10];
    private int size = 10;
    private int top;

    Stack()
    {
        top = -1;
    }

    Stack(int size)
    {
        stack = new int[size];
        top = -1;
    }

    void push(int value)
    {
        if(top == size-1)
        {
            throw new IllegalArgumentException("Stack is Full");
        }
        else
        {
            top = top + 1;
            stack[top] = value;
        }
    }

    void pop()
    {
        if(top == -1)
        {
            throw new IllegalArgumentException("Stack is Empty");
        }
        else
        {
            top = top - 1;
        }
    }

    void display()
    {
        for(int i=0; i<=top; i++)
        {
            System.out.print(stack[i]+" ");
        }
        System.out.println();
    }
}

class StackExample
{
    public static void main(String[] args)
    {
        Stack s = new Stack();

        s.push(12);
        s.push(13);
        s.push(14);
        s.push(15);
        s.push(16);

        s.display();
        
        s.pop();
        s.pop();


        s.display();
    }
}