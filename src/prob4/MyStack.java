package prob4;

public class MyStack<E> implements Stack {
	//field
	private E[] buffer;
	private int capacity;
	private int top;
	
	//constructor
	public MyStack(int capacity) throws MyStackException { 

		if (capacity <=0){
			throw new MyStackException ("Buffer size should be bigger than zero");	
		}
		this.capacity = capacity;
		this.buffer = new E[capacity];
		this.top = 0;
	}	
	
	@Override
	public void push(E str) throws RuntimeException {
		if(top == capacity){
			E[] temp = buffer;
			buffer = new E[capacity *2];
			System.arraycopy(temp, 0, buffer, 0, capacity);			
		}
		buffer[top] = str;
		top += 1;
	}


	@Override
	public E pop() throws RuntimeException {
		E a = buffer[top];
		top -= 1;
		return a;
	}

	@Override
	public boolean isEmpty() {
		if ( top == -1 ){return true;}
		else {return false;}
	}

	@Override
	public int size() {
		return top;
	}

	@Override
	public void push(String str) throws RuntimeException {
		// TODO Auto-generated method stub
		
	}


	}

}
