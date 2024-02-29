package com.student.info.globalresource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerResource {
	
	public static Logger getLogger(Class LoggerResource) {
		return LoggerFactory.getLogger(LoggerResource);
	}

}
