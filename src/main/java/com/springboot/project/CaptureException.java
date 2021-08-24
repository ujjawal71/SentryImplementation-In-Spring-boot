package com.springboot.project;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import io.sentry.Sentry;

@Service
public class CaptureException {

	@Value("${sentry.dsn}")
	private String dsn;
	
	public void Capture(Exception e)
	{
		Sentry.init(options -> {
			  options.setDsn(dsn);
			  options.setEnableExternalConfiguration(true);
			});
		
		Sentry.captureException(e);
		
		
	}
	
}
