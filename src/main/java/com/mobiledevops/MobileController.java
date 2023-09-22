package com.mobiledevops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MobileController {
@GetMapping("/get")
public String get() {
	return "Hello Santhosh";
}
}
