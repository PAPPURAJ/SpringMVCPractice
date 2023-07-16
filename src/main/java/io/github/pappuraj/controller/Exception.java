package io.github.pappuraj.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class Exception {
	

	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler({NullPointerException.class,StringIndexOutOfBoundsException.class})
	public String handle() {
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		return "error";
	}
}
