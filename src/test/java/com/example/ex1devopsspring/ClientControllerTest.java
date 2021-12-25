package com.example.ex1devopsspring;

import com.example.ex1devopsspring.controller.ClientController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(controllers = ClientController.class)
public class ClientControllerTest {


    private MockMvc mockMvc;
}
