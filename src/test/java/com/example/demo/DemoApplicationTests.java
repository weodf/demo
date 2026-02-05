//package com.example.demo;
//
//import com.example.demo.controller.HelloWorldController;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.test.web.servlet.MockMvc;
//
//import static org.hamcrest.Matchers.containsString;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@WebMvcTest(controllers = HelloWorldController.class)
//class DemoApplicationTests {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Test
//    void contextLoads() {
//        // 这个测试只是简单地检查应用上下文是否能成功加载
//    }
//
//    @Test
//    void shouldReturnDefaultMessage() throws Exception {
//        this.mockMvc.perform(get("/hello"))
//                .andExpect(status().isOk())
//                .andExpect(content().string(containsString("Hello, World!")));
//    }
//}
