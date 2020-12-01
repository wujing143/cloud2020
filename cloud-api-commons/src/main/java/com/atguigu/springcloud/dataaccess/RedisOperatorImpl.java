package com.atguigu.springcloud.dataaccess;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * redis缓存操作接口实现
 */
public class RedisOperatorImpl implements RedisOperator {

    private RedisTemplate<String, String> stringRedisTemplate;
    private RedisTemplate<String, Object> objectRedisTemplate;
    private ValueOperations<String, String> stringOperations;
    private ValueOperations<String, Object> objectOperations;
    private HashOperations<String, String, String> stringHashOperations;
    private HashOperations<String, String, Object> objectHashOperations;

    public RedisOperatorImpl() {
    }

    public RedisOperatorImpl(RedisTemplate<String, String> stringRedisTemplate, RedisTemplate<String, Object> objectRedisTemplate) {
        this.stringRedisTemplate = stringRedisTemplate;
        this.objectRedisTemplate = objectRedisTemplate;
        this.stringOperations = stringRedisTemplate.opsForValue();
        this.objectOperations = objectRedisTemplate.opsForValue();
        this.stringHashOperations = stringRedisTemplate.opsForHash();
        this.objectHashOperations = objectRedisTemplate.opsForHash();
    }

//    @Resource(name="icosStringRedisTemplate")
//    private RedisTemplate<String, String> redisTemplate;
//
//    @Resource(name="icosStringRedisTemplate")
//    private ValueOperations<String, String> stringOperations;
//
//    @Resource(name="icosObjectHashRedisTemplate")
//    private ValueOperations<String, Object> objectOperations;
//
//    @Resource(name="icosStringRedisTemplate")
//    private HashOperations<String, String, String> stringHashOperations;
//
//    @Resource(name="icosObjectHashRedisTemplate")
//    private HashOperations<String, String, Object> objectHashOperations;

    @Override
    public void keySetString(String key, String val) {
        stringOperations.set(key, val);
    }

    @Override
    public void keySetString(String key, String value, long timeout, TimeUnit unit) {
        stringOperations.set(key, value, timeout, unit);
    }

    @Override
    public void keyExpire(String key, long timeout, TimeUnit unit) {
        stringRedisTemplate.expire(key, timeout, unit);
    }

    @Override
    public boolean delete(String key) {
        return stringRedisTemplate.delete(key);
    }

    @Override
    public String keyGetString(String key) {
        return stringOperations.get(key);
    }

    @Override
    public void keySetObject(String key, Object val) {
        objectOperations.set(key, val);
    }


    @Override
    public void keySetObject(String key, Object value, long timeout, TimeUnit unit) {
        objectOperations.set(key, value, timeout, unit);
    }

    @Override
    public <T> T  keyGetObject(String key) {
        return (T) objectOperations.get(key);
    }

    @Override
    public void hashDel(String key, String hKey) {
        stringHashOperations.delete(key, hKey);
    }

    @Override
    public void hashPutString(String key, String hKey, String hVal) {
        stringHashOperations.put(key, hKey, hVal);
    }

    @Override
    public String hashGetString(String key, String hKey) {
        return stringHashOperations.get(key, hKey);
    }

    @Override
    public List<String> hashGetMultiString(String key, String... hKeys) {
        return stringHashOperations.multiGet(key, Arrays.asList(hKeys));
    }

    @Override
    public void hashPutObject(String key, String hKey, Object hVal) {
        objectHashOperations.put(key, hKey, hVal);
    }

    @Override
    public <T> T hashGetObject(String key, String hKey) {
        return (T) objectHashOperations.get(key, hKey);
    }

    @Override
    public List<Object> hashGetMultiObject(String key, String... hKeys) {
        return objectHashOperations.multiGet(key, Arrays.asList(hKeys));
    }

    public long hashIncr(String key, String hKey){
        return stringHashOperations.increment(key, hKey, 1);
    }

    @Override
    public String now() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return stringRedisTemplate.execute((RedisCallback<String>) connection -> sdf.format(new Date(connection.time())));
    }

}
