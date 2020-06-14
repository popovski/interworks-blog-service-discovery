package mk.com.interworks.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ProductController {
	@Value("${service.instance.name:payment-service}")
	private String instanceName;
	
	@GetMapping
	public String message() {
		String response = "Response From: " + instanceName;
		return response;
	}
}