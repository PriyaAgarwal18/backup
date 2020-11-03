package com.mindtree.hospital.controller;

import org.hibernate.service.spi.ServiceException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice(assignableTypes = { Hospitalcontroller.class })
class Controllerexception {
	@ExceptionHandler(ServiceException.class)
	public ResponseEntity<Exception> ServiceExceptionHandler(Exception e, Throwable cause) {
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Exception(e.getMessage()));
	}

}
