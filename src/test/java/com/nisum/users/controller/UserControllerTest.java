package com.nisum.users.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nisum.users.dto.UserDataDTO;
import com.nisum.users.dto.UserResponseDTO;
import com.nisum.users.service.UserService;
import com.nisum.users.utils.MockUtils;

@RunWith(MockitoJUnitRunner.Silent.class)
@EnableWebMvc
public class UserControllerTest {

	private static final String BASE_URL = "/users";

	@Autowired
	private MockMvc mockMvc;

	@Mock
	private UserService userService;

	@InjectMocks
	private UserController userController;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);

		mockMvc = MockMvcBuilders.standaloneSetup(userController).addPlaceholderValue("/", BASE_URL).build();

	}

	private UserDataDTO dtoUserIn;
	private UserResponseDTO dtoUserOut;

	public static String asJsonString(final Object obj) {
		try {
			return new ObjectMapper().writeValueAsString(obj);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Test
	public void signupTest() throws Exception {

		dtoUserIn = MockUtils.getMock("dto/UserDataDTO.json", UserDataDTO.class);

		when(userService.signup(dtoUserIn)).thenReturn(dtoUserOut);

		mockMvc.perform(post(BASE_URL + "/signup").content(asJsonString(dtoUserIn))
				.contentType(MediaType.APPLICATION_JSON).accept(MediaType.ALL)).andExpect(status().isOk());

	}

	@Test
	public void signinTest() throws Exception {

		mockMvc.perform(post(BASE_URL + "/signin?username=arbonardi&password=arbonardi")
				.contentType(MediaType.APPLICATION_JSON).content("").accept(MediaType.ALL))
				.andExpect(status().isOk());

	}
	
	@Test
	public void usersTest() throws Exception {

		mockMvc.perform(get(BASE_URL + "/users/arbonardi")
				.header("Authorization", "Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhcmJvbmFyZGkiLCJhdXRoIjpbeyJhdXRob3JpdHkiOiJST0xFX0FETUlOIn1dLCJpYXQiOjE2OTc0NjAzMDQsImV4cCI6MTY5NzQ2MDYwNH0.6FufhbohSsBTNkX7i0wE4D_PLulTAR_--W3tuWlisE4")
				.contentType(MediaType.APPLICATION_JSON)
				.content("")
				.accept(MediaType.ALL))
				.andExpect(status().is4xxClientError());  // Usuario no encontrado

	}
	
	@Test
	public void refreshTest() throws Exception {

		mockMvc.perform(get(BASE_URL + "/users/refresh")
				.header("Authorization", "Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhcmJvbmFyZGkiLCJhdXRoIjpbeyJhdXRob3JpdHkiOiJST0xFX0FETUlOIn1dLCJpYXQiOjE2OTc0NjAzMDQsImV4cCI6MTY5NzQ2MDYwNH0.6FufhbohSsBTNkX7i0wE4D_PLulTAR_--W3tuWlisE4")
				.contentType(MediaType.APPLICATION_JSON)
				.content("")
				.accept(MediaType.ALL))
				.andExpect(status().is4xxClientError());  // Usuario no encontrado

	}
	
	@Test
	public void meTest() throws Exception {

		mockMvc.perform(get(BASE_URL + "/users/me")
				.header("Authorization", "Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhcmJvbmFyZGkiLCJhdXRoIjpbeyJhdXRob3JpdHkiOiJST0xFX0FETUlOIn1dLCJpYXQiOjE2OTc0NjAzMDQsImV4cCI6MTY5NzQ2MDYwNH0.6FufhbohSsBTNkX7i0wE4D_PLulTAR_--W3tuWlisE4")
				.contentType(MediaType.APPLICATION_JSON)
				.content("")
				.accept(MediaType.ALL))
				.andExpect(status().is4xxClientError());  // Usuario no encontrado
	}
	
	@Test
	public void deleteUserTest() throws Exception {

		mockMvc.perform(delete(BASE_URL + "/users/arbonardi")
				.header("Authorization", "Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhcmJvbmFyZGkiLCJhdXRoIjpbeyJhdXRob3JpdHkiOiJST0xFX0FETUlOIn1dLCJpYXQiOjE2OTc0NjAzMDQsImV4cCI6MTY5NzQ2MDYwNH0.6FufhbohSsBTNkX7i0wE4D_PLulTAR_--W3tuWlisE4")
				.contentType(MediaType.APPLICATION_JSON)
				.content("")
				.accept(MediaType.ALL))
				.andExpect(status().is4xxClientError());  // Usuario no encontrado

	}
	

	

}
