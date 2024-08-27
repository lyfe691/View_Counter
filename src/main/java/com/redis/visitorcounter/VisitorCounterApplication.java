package com.redis.visitorcounter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class VisitorCounterApplication {

    public static void main(String[] args) {
        SpringApplication.run(VisitorCounterApplication.class, args);
    }
}

@RestController
class VisitorCounterController {

    private final StringRedisTemplate redisTemplate;

    VisitorCounterController(StringRedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    @GetMapping("/")
    public String visit() {
        Long count = redisTemplate.opsForValue().increment("visitorCount");
        return "Visitor number: " + count;
    }
}

