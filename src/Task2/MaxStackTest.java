package Task2;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class MaxStackTest {

    @Test

    public void test1(){
        MaxStack stack=new MaxStack();
        stack.push(3);
        stack.push(2);
        stack.push(5);
        stack.push(6);
        Assert.assertEquals(6,stack.max());
    }

    @Test

    public void test2(){
        MaxStack stack=new MaxStack();
        stack.push(3);
        stack.push(2);
        stack.push(5);
        stack.push(6);
        stack.pop();
        Assert.assertEquals(5,stack.max());
    }

    @Test

    public void test3(){
        MaxStack stack=new MaxStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(2);
        stack.pop();
        Assert.assertEquals(3,stack.max());
    }



}
