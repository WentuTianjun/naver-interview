package com.cn.naver.interview;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author liuchen25
 * @description
 * @time 2020/4/11 9:58
 */
public class Program1Test {

    @Test
    public void testExecuteTask() {
        List<Task> tasks = Arrays.asList(new Task("A"), new Task("B")
                , new Task("C"), new Task("D")
                , new Task("E"), new Task("F")
                , new Task("G"), new Task("H"));
        Program1.executeTask(tasks);
    }
}
