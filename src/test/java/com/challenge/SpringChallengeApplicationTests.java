package com.challenge;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.challenge.entity.User;
import com.challenge.service.interfaces.UserServiceInterface;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringChallengeApplicationTests {

	@Autowired
	UserServiceInterface service;

	@Test
	public void contextLoads() {
	}

	@Test
	public void whenSaveUser() {
		User user = new User();
		user.setFullName("Test User");
		user.setNickname("testNick");
		user.setEmail("test@email.com");
		user.setPassword("testePassword123");

		User savedUser = service.save(user);

		assertNotNull(savedUser);

	}
}
