package com.example.demo.Service;

import com.example.demo.model.Greeting;
import com.example.demo.dto.UserDto;

public interface IGreetingService {
	 Greeting greetingMessage();
	 String greetingMessageByName(UserDto userDto);
}
