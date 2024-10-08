package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.FactoryBasedNavigableListAssert.assertThat;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
        Object test = new Object();
        assert test != null;
    }

}
