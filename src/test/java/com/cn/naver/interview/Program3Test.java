package com.cn.naver.interview;

import org.junit.Test;

/**
 * @author liuchen25
 * @description
 * @time 2020/4/11 9:58
 */
public class Program3Test {

    @Test
    public void testPush() {
        MyArrayQueue<Integer> queue = new MyArrayQueue();
        queue.push(1);
    }

    @Test
    public void testPop() {
        MyArrayQueue<Integer> queue = new MyArrayQueue();
        queue.push(1);
        queue.pop();
    }

    @Test
    public void testPeek() {
        MyArrayQueue<Integer> queue = new MyArrayQueue();
        queue.push(1);
        queue.peek();
    }

    @Test
    public void testEmpty() {
        MyArrayQueue<Integer> queue = new MyArrayQueue();
        queue.push(1);
        queue.empty();
    }
}
