package com.example.resttest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Locale;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(WelcomeController.class)
public class ResttestApplicationTests {

	@Autowired
	private MockMvc mockMvc;
	

	@Test
	public void getMessage() throws Exception {
		mockMvc.perform(get("/welcome").header("Accept-Language", new Locale("pt", "PT"))).andDo(print())
				.andExpect(status().isOk()).andExpect(content().string("Welcome..."));

	}

}
