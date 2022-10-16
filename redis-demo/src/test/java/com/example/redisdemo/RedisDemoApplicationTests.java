package com.example.redisdemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;

@SpringBootTest
class RedisDemoApplicationTests {



    @Resource
    private RedisTemplate<String,Object> redisTemplate;

    @Test
    void testString() {
        // д��һ��String����
        redisTemplate.opsForValue().set("name", "tiger");
        // ��ȡstring����
        Object name = redisTemplate.opsForValue().get("name");
        System.out.println("name = " + name);
    }

}
