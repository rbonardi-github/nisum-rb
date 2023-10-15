package com.nisum.users.controller;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.mockito.*;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nisum.users.dto.UserDataDTO;
import com.nisum.users.dto.UserResponseDTO;
import com.nisum.users.service.UserService;
import com.nisum.users.utils.MockUtils;


@SpringBootTest
public class UserControllerTest {

	private static final String BASE_URL = "/users";
	
	@Autowired
    private ObjectMapper objectMapper;
	
	private MockMvc mockMvc;

	@MockBean
	private UserService userService;

	@InjectMocks
	private UserController userController;
	
	private UserDataDTO dtoUserIn;
	private UserResponseDTO dtoUserOut;
	
	@Before
    public void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(userController).build();
    }
	
	/*
	@BeforeClass
    public static void setup() {
        UserDetails userDetails = new User("user@email.com", "password", List.of(new SimpleGrantedAuthority("ROLE_ADMIN")));
        Authentication authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());

        SecurityContext securityContext = SecurityContextHolder.createEmptyContext();
        securityContext.setAuthentication(authentication);
        SecurityContextHolder.setContext(securityContext);
    }
	*/
	
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
	
	public static String asJsonString(final Object obj) {
	    try {
	        return new ObjectMapper().writeValueAsString(obj);
	    } catch (Exception e) {
	        throw new RuntimeException(e);
	    }
	}
	
	@Test
	void signupTest() throws Exception {
		
		dtoUserIn = MockUtils.getMock("dto/UserDataDTO.json", UserDataDTO.class);
		//dtoUserOut = MockUtils.getMock("dto/UserResponseDTO.json", UserResponseDTO.class);
		
		//System.out.println(dtoUserIn);
		//System.out.println(dtoUserOut);
		
		//System.out.println(objectMapper.writeValueAsString(dtoUserIn));
		
		Mockito.when(userService.signup(dtoUserIn)).thenReturn(dtoUserOut);
		
		mockMvc.perform(post(BASE_URL+"/signup")
    			.content(asJsonString(dtoUserIn))
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.ALL))
				.andExpect(status().isOk());

	}
	
	@AfterClass
    public static void teardown() {
        // Restaurar el SecurityContext a su estado original después de todas las pruebas
        SecurityContextHolder.clearContext();
    }
}
