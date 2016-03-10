package se.kth.iv1201.spring.web.controllers;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorHandler {
	public Logger logger = Logger.getLogger(ErrorHandler.class);
	
	@ExceptionHandler(Exception.class)
	public String handleException(Exception e){
		logger.info("Error has occurred :" + e.getMessage() );
		return "error";
	}

}
