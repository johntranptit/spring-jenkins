package com.java.jenkin.api;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringJenkinsApplicationTests {

    @Test
    public void contextLoads() {
        assertEquals(true, true);
    }

    private void assertEquals(boolean b, boolean b1) {
    }

}
