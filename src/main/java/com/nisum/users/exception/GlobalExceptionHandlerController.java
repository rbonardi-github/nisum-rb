package com.nisum.users.exception;

import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.http.ResponseEntity;

@RestControllerAdvice
public class GlobalExceptionHandlerController {

	@Bean
	public ErrorAttributes errorAttributes() {
		// Hide exception field in the return object
		return new DefaultErrorAttributes() {
			@Override
			public Map<String, Object> getErrorAttributes(WebRequest webRequest, ErrorAttributeOptions options) {
				return super.getErrorAttributes(webRequest,
						ErrorAttributeOptions.defaults().excluding(ErrorAttributeOptions.Include.EXCEPTION));
			}
		};
	}

	@ExceptionHandler(value = CustomException.class)
	public ResponseEntity<Object> handleCustomException(HttpServletResponse res, CustomException ex) throws IOException {
		//res.sendError(ex.getHttpStatus().value(), ex.getMessage());
		return new ResponseEntity<>(ex.getMessage(), ex.getHttpStatus());
	}

	@ExceptionHandler(value = AccessDeniedException.class)
	public void handleAccessDeniedException(HttpServletResponse res) throws IOException {
		res.sendError(HttpStatus.FORBIDDEN.value(), "Access denied");
	}

	@ExceptionHandler(value = Exception.class)
	public void handleException(HttpServletResponse res) throws IOException {
		res.sendError(HttpStatus.BAD_REQUEST.value(), "Something went wrong");
	}

}
