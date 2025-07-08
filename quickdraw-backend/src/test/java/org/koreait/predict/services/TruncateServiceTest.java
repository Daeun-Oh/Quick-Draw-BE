package org.koreait.predict.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@AutoConfigureMockMvc
public class TruncateServiceTest {

    @Autowired
    private TruncateService service;

    @Test
    void test() throws Exception {
        service.process();
    }
}
