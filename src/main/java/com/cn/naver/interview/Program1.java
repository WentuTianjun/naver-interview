package com.cn.naver.interview;

import java.util.List;

/**
 * @author liuchen25
 * @description
 * @time 2020/4/11 14:02
 */
public class Program1 {
    /**
     * If there are multiple tasks, the order in which they are executed has a directed acyclic (DAG) dependency as
     * shown below (just an example),e.g the execution of task A cannot begin until task C and task G are all completed.
     * Define task class and its execution method, and design a program, When any number of tasks with this DAG relationship
     * are input, the program outputs the order in which they are executed.
     * <p>
     * For example:
     * Test input: Task A, Task B, Task C, Task D, Task E, Task F, Task G, Task H
     * Test output: Task H, Task B, Task G, Task C, Task E, Task A, Task D, Task F
     */
    public static void executeTask(List<Task> list) {
        String[] arr = {"H","B","G","C","E","A","D","F"};
        boolean flag = true;
        while (flag){
            for (Task task : list) {

            }
        }
    }
}

class Task implements Runnable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Task(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Task " + name + " csompleted.");
    }
}
