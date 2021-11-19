package com.example.demo.Service;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Service;
import com.example.demo.dto.Greeting;

@Service
public class GreetingService implements IGreetingService{
	private static final String template = "Hello world";
    private final AtomicLong counter = new AtomicLong();
    
	@Override
	public Greeting greetingMessage() {
		return new Greeting(counter.incrementAndGet(), String.format(template));
	}
}
