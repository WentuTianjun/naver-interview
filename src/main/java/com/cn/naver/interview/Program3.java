package com.cn.naver.interview;

/**
 * @author liuchen25
 * @description
 * @time 2020/4/11 14:02
 */
public class Program3 {
    /**
     * Implement a Queue of your own design with an array or stack respectively,
     * including push, pop, peek, empty methods.
     */
}

class MyArrayQueue<T> {
    private T[] arr;

    public MyArrayQueue() {
        arr = (T[]) new Object[0];

    }

    public void push(T obj) {
        T[] newArr = (T[]) new Object[0];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        newArr[arr.length] = obj;
        arr = newArr;
    }

    public T pop() {
        if (arr.length == 0) {
            throw new RuntimeException("Queue is empty");
        }

        return arr[0];
    }

    public T peek() {
        if (arr.length == 0) {
            throw new RuntimeException("Queue is empty");
        }

        T element = null;
        T[] newArr = (T[]) new Object[arr.length - 1];
        System.arraycopy(arr, 1, newArr, 0, arr.length - 1);
        element = arr[0];
        arr = newArr;

        return element;
    }

    public void empty() {
        if (arr.length > 0) {
            arr = (T[]) new Object[0];
        }
    }
}
