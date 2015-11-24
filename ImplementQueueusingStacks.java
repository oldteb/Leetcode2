class MyQueue {

    Stack<Integer> inStack = new Stack<Integer>();
    Stack<Integer> outStack = new Stack<Integer>();

    // Push element x to the back of queue.
    public void push(int x) {
        instack.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        if(outStack.size() == 0){
            while(inStack.size() != 0){
                outStack.push(inStack.pop());
            }
        }

        outStack.pop();
    }

    // Get the front element.
    public int peek() {
        if(outStack.size() == 0){
            while(inStack.size() != 0){
                outStack.push(inStack.pop());
            }
        }
        return outStack.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        if(instack.size() + outStack.size() == 0)  return true;
        else return false;
    }
}
