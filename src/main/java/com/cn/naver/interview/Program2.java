package com.cn.naver.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author liuchen25
 * @description
 * @time 2020/4/11 14:02
 */
public class Program2<K, T> {
    /**
     * Implement a cache class (CachedData) that caches the target data, and implement a method (processCachedData),
     * which process the data if the cache is valid, if not, first update the cache object according to its data source,
     * then process it.
     * <p>
     * Requirments:
     * <p>
     * * Use ReentrantReadWriteLock to implement above requirements.
     * * Use lock downgrading
     */


    private Map<K, T> cache = new HashMap<>();

    static ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    static Lock readLock = readWriteLock.readLock();
    static Lock writeLock = readWriteLock.writeLock();

    public void processCachedData(K key, T value) {
        T temp = null;
        try {
            readLock.lock();
            temp = cache.get(key);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            readLock.unlock();
        }
        if (temp != null) {
            try {
                writeLock.lock();
                cache.put(key, value);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                writeLock.unlock();
            }
        }
    }
}
