package prob5;

import java.util.Arrays;

public class MyStack {
	private int top;
	private String[] buffer;

	@SuppressWarnings("unchecked")
	public MyStack(int capacity) {
		buffer = new String[capacity];
		top = -1;
	}

	public void push(String s) {
		if(top == buffer.length-1) {
			buffer = Arrays.copyOf(buffer, buffer.length+buffer.length);
			buffer[++top] = s;
		} else {
			buffer[++top] = s;
		}
	}

	public String pop() throws MyStackException {
		if(isEmpty()) {
			throw new MyStackException("stack is empty");
		} else {
			String str = buffer[top];
			buffer[top--] = null;
			return str;
		}
	}

	public boolean isEmpty() {
		return top == -1;
	}
}