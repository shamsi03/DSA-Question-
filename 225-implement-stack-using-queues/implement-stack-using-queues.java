class MyStack {
    Queue<Integer>main;
    Queue<Integer>dummy;
    public MyStack() {
        main = new LinkedList<>();
        dummy = new LinkedList<>();
    }
    
    public void push(int x) {
        while(!main.isEmpty())
        {
            dummy.add(main.remove());
        }

        main.add(x);

        while(!dummy.isEmpty())
        {
            main.add(dummy.remove());
        }
    }
    
    public int pop() {
        return main.remove();
    }
    
    public int top() {
        return main.peek();
    }
    
    public boolean empty() {
        return main.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */