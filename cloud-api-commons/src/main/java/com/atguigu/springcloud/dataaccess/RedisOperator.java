package com.atguigu.springcloud.dataaccess;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * redis缓存操作
 */
public interface RedisOperator {

    boolean delete(String key);

    void keySetString(String key, String val);

    void keySetString(String key, String value, long timeout, TimeUnit unit);

    void keyExpire(String key, long timeout, TimeUnit unit);

    String keyGetString(String key);

    void keySetObject(String key, Object val);

    void keySetObject(String key, Object value, long timeout, TimeUnit unit);

    <T> T keyGetObject(String key);

    void hashDel(String key, String hKey);

    void hashPutString(String key, String hKey, String hVal);

    String hashGetString(String key, String hKey);

    List<String> hashGetMultiString(String key, String... hKeys);

    void hashPutObject(String key, String hKey, Object hVal);

    <T> T hashGetObject(String key, String hKey);

    List<Object> hashGetMultiObject(String key, String... hKeys);

    long hashIncr(String key, String hKey);

    String now();
}
