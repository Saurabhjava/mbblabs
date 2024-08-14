package com.mbb.exception;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class EmployeeExceptionHandler {
	@ResponseBody
	@ExceptionHandler(value = { EmployeeNotFoundException.class })
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public ErrorMapper handleException(Exception e, HttpServletRequest req) {
		String uri = req.getRequestURI();
		return new ErrorMapper(e.getMessage(), uri, LocalDate.now());
	}

	@ResponseBody
	@ExceptionHandler(value = { EmployeeCreationException.class })
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	public ErrorMapper handleException1(Exception e, HttpServletRequest req) {
		String uri = req.getRequestURI();
		return new ErrorMapper(e.getMessage(), uri, LocalDate.now());
	}
	@ResponseBody
	@ExceptionHandler(value = { MethodArgumentNotValidException.class})
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	public Map<String, String> handleException2(MethodArgumentNotValidException ex) {
		Map<String, String> m=new HashMap<String,String>();
		ex.getBindingResult().getAllErrors().forEach((error)->{
			String fieldName=((FieldError)error).getField();
			String message=error.getDefaultMessage();
			m.put(fieldName, message);
		});
		return m;
	}
}
