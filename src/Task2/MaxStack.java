package Task2;

import java.util.Stack;

public class MaxStack {

    private Stack<Integer> mainStack;
    private Stack<Integer> maxStack;

    MaxStack(){
        mainStack= new Stack<>();
        maxStack= new Stack<>();
    }

    public void push(int x){
        mainStack.push(x);

        if (maxStack.isEmpty() || x>=maxStack.peek()){
            maxStack.push(x);
        }
    }

    public int pop(){

      if(mainStack.isEmpty()){
          throw new RuntimeException("Stack is empty.");
      }
      int popped= mainStack.pop();
      if (popped==maxStack.peek()){
          maxStack.pop();
      }
      return popped;
    }

   public int max(){
       return maxStack.peek();
    }

}
