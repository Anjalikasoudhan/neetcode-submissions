class MinStack {
       Stack<Integer> st;
       Stack<Integer> minst;
    public MinStack() {
      st=new Stack<>();
      minst=new Stack();
    }
    
    public void push(int val) {
        st.push(val);
        if(minst.isEmpty()){
            minst.push(val);
        }else{
            int currentmin=minst.peek();
            minst.push(Math.min(val,currentmin));
        }
    }
    
    public void pop() {
        st.pop();
        minst.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
      return  minst.peek();
    }
}
