package com.mindtree.hospital.controller.handler;

import java.util.LinkedHashMap;
import java.util.Map;

import org.hibernate.service.spi.ServiceException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice(assignableTypes = Controllerhandler.class)
public class Controllerhandler {
	
	@ExceptionHandler(ServiceException.class)
		public ResponseEntity<Map<String,Object>> serviceExceptionHandler(Exception e,Throwable cause){
			Map<String,Object> response=new LinkedHashMap<String, Object>();
			response.put("header", "list of doctor details");
			response.put("error", true);
			response.put("body", e.getMessage());
			response.put("Httpstatus", HttpStatus.BAD_REQUEST);
			return new ResponseEntity<Map<String,Object>>(response,HttpStatus.BAD_REQUEST);
				
		}	

	}



