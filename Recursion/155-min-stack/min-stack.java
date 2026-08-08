class MinStack {
    int min = Integer.MAX_VALUE;
    Stack<int[]> stack;
    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int value) {
        min = Math.min(value,min);
        stack.push(new int[]{value,min});
    }
    
    public void pop() {
        stack.pop();
        if(stack.isEmpty()){
            min = Integer.MAX_VALUE;
            return;
        }
        min = stack.peek()[1];
    }
    
    public int top() {
        return stack.peek()[0];
    }
    
    public int getMin() {
        return stack.peek()[1];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */