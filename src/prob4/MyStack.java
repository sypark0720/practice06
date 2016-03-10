package prob4;

public class MyStack implements Stack {
	//field
	private String[] buffer;
	private int capacity;
	private int top;
	
	//constructor
	public MyStack(int capacity) throws MyStackException { 

		if (capacity <=0){
			throw new MyStackException ("Buffer size should be bigger than zero");	
		}
		this.capacity = capacity;
		this.buffer = new String[capacity];
		this.top = 0;
	}	
	
	@Override
	public void push(String str) throws RuntimeException {
		if(top == capacity){
			String[] temp = buffer;
			buffer = new String[capacity *2];
			System.arraycopy(temp, 0, buffer, 0, capacity);			
		}
		buffer[top] = str;
		top += 1;
	}


	@Override
	public String pop() throws RuntimeException {
		String a = buffer[top];
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

}
