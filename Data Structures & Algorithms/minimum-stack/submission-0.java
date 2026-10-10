class MinStack {

    Stack<Integer> st;

    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
    }
    
    public void pop() {
        if(!st.isEmpty()) st.pop();
    }
    
    public int top() {
        if(!st.isEmpty()) return st.peek();
        return -1;
    }
    
    public int getMin() {
        Stack<Integer> temp = new Stack<>();
        temp.addAll(st);

        int min = temp.pop();

        while(!temp.isEmpty()) {
            int x = temp.pop();
            if(x < min) min = x;
        }

        return min;
    }
}
