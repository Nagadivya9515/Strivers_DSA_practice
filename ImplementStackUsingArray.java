
class Stack {
    int top=-1;
    int maxSize=10;

    public void push(int value, int arr[])
    {
        if(top<maxSize-1)
        {
            top++;
            arr[top]=value;
        }
    }
    public boolean isEmpty()
    {
        return top==-1? true:false;
    }

    public int peek(int arr[])
    {
        if(isEmpty()) return -1;
        return arr[top];
    }

    public void pop(int arr[])
    {
        if(isEmpty())
        {
            return;
        }
        top--;
        arr[top+1]=0;
    }
    public int size()
    {
        return top+1;
    }

    public void display(int arr[])
        {
            for(int i=top;i>=0;i--)
            {
                System.out.print(arr[i]+" ");
            }
        }
}
public class ImplementStackUsingArray {
    public static void main(String[] args) {
    int arr[]=new int[10];
    Stack st = new Stack();
    System.out.println("Stack is: ");
    st.display(arr);
    System.out.println("\nStack is empty: "+st.isEmpty());
    st.push(10, arr);
    st.push(9, arr);
    st.push(8, arr);
    System.out.println("\nStack is empty: "+st.isEmpty());
    st.display(arr);
    st.pop(arr);
    System.out.println("\nStack after pop: ");
    st.display(arr);
    System.out.println("\nTop element: "+st.peek(arr));
    st.pop(arr);
    st.display(arr);
    st.pop(arr);    
    st.display(arr);
    }
}
