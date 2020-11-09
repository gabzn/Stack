public class StackWithChar
{
        private int size;
        private char[] stackArray;
        private int top;

        public StackWithChar(int size) throws ArrayIndexOutOfBoundsException
        {
            this.size = size;
            this.stackArray = new char[size];
            this.top = -1;
        }

        public void push(char i)
        {
            this.top++;
            this.stackArray[top] = i;
        }

        public char pop()
        {
            int copy = this.top;
            this.top--;
            return this.stackArray[copy];
        }

        public String reverseString(String str)
        {
            int stackSize = str.length();
            StackWithChar strStack = new StackWithChar(stackSize);
            String toReturn = "";

            for(int i=0;i<stackSize;i++)
            {
                strStack.push(str.charAt(i));
            }

            while(!strStack.isEmpty())
            {
                toReturn = toReturn + strStack.pop();
            }

            return toReturn;
        }

        public char topValue()
        {
            return this.stackArray[top];
        }

        public boolean isEmpty()
        {
            return (this.top == -1);
        }

        public boolean isFull()
        {
            return (this.top == this.size-1);
        }

        public int getSize()
        {
            return this.top+1;
        }

}
