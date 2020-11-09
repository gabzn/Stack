public class StackUsingLL
{
    private Node top;
    private int size;

    private class Node
    {
        private Node next;
        private int data;

        Node()
        {
            this.next = null;
        }

        Node(int data)
        {
            this.next = null;
            this.data = data;
        }

        boolean hasNext()
        {
            return (next != null);
        }

        int getData()
        {
            return data;
        }
    }

    public StackUsingLL()
    {
        top = new Node();
        size = 0;
    }

    public void push(int data)
    {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public void pop() throws Exception
    {
        if(isEmpty()) throw new Exception("Empty stack.");
        top = top.next;
        size--;
    }

    public int peek() throws Exception
    {
        if(isEmpty()) throw new Exception("Empty stack.");
        return top.data;
    }

    public boolean isEmpty()
    {
        return (size==0);
    }

    public void display()
    {
        Node tempNode = top;
        while(tempNode.hasNext())
        {
            System.out.println(tempNode.getData());
            tempNode = tempNode.next;
        }
    }
}

/*
   Implementing stacks using singly linked list with Head insertion.
   The last element in will be the head.
   Head insertion is always preferred with singly linked list because we can pop the element easily unlike tail insertion where we will need to get to tail.

   Vice versa.
   With Tail insertion, the last element in will be the tail.
 */