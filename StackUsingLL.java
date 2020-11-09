public class StackUsingLL
{
    private Node head;
    private int size;

    private class Node
    {
        private Node next;
        private int data;

        Node(int data)
        {
            this.next = null;
            this.data = data;
        }
    }

    public void push(int data)
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void pop() throws Exception
    {
        if(isEmpty()) throw new Exception("Empty stack.");
        head = head.next;
        size--;
    }

    public int peek() throws Exception
    {
        if(isEmpty()) throw new Exception("Empty stack.");
        return head.data;
    }

    public boolean isEmpty()
    {
        return (size==0);
    }
}










/*
   Implementing stacks using singly linked list with Head insertion.
   The last element in will be the head.
   Head insertion is always preferred with singly linked list because we can pop the element easily unlike tail insertion where we will need to get to tail.

   Vice versa.
   With Tail insertion, the last element in will be the tail.
 */