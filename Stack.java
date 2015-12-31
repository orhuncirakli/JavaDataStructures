public class Stack {
	
	int maxSize;
	int stackArray[];
	int top;
	
	public Stack(int mS) {
		maxSize = mS;
		stackArray = new int[maxSize];
		top = -1;
	}
	
	public boolean full() {
		return (top == maxSize - 1);
	}
	
	public boolean empty() {
		return(top == -1);
	}
	
	public void push(int x) {
		if(full()) throw new RuntimeException("Yığıt dolu!");
		++top;
		stackArray[top] = x;
	}
	
	public int pop() {
		if(empty()) throw new RuntimeException("Yığıt boş!");
		int temp = stackArray[top];
		top--;
		return temp;
	}
	
	public int peek() {
		return stackArray[top];
	}
	
}

class StackOrnek {
	
	public static void main(String[] args) {
	Stack s = new Stack(5);
	s.push(21);
	s.push(45);
	s.push(5);
	s.push(12);
	s.push(67);
	s.push(56);
	System.out.println(s.peek());
	}
}
