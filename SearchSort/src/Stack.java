
class Stack
{
   
    int top;
    char a[] ; 
    int size;
    int down;
   
 
     boolean isEmpty()
    {
        return (top < 0);
    }
    Stack(int size)
    {
        top = -1;
        down=0;
        this.size=size;
        a=new char[size];
    }
 
    boolean push(char x)
    {
        if (top >= size)
        {
            System.out.println("Stack Overflow");
            return false;
        }
        else
        {
            a[++top] = x;
            return true;
        }
    }
 
    char pop()
    {
        if (top < 0)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else
        {
            char x = a[top--];
            return x;
        }
    }
    
   
    
    public int peek() {
		return a[top];
	}
	public void search(int i) {
		int c=0;
		for(int j=0;j<size;j++) {
			if(a[j]==i)
				c++;
		}
		if(c>0)
			System.out.println(i+" is present");
		else
			System.out.println(i+" is not present");
	}
}
 