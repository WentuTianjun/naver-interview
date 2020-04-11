package com.cn.naver.interview;

import org.junit.Test;

/**
 * @author liuchen25
 * @description
 * @time 2020/4/11 9:58
 */
public class Program2Test {

    @Test
    public void testProcessCachedData() {
        Program2<String, String> cache = new Program2<>();
        cache.processCachedData("name", "laoliu");
    }
}
