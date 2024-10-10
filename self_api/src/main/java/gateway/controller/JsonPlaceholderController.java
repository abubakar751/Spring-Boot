package gateway.controller;

import gateway.dto.UserDto;
import gateway.service.JsonPlaceholderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class JsonPlaceholderController {

	 private final JsonPlaceholderService jsonPlaceholderService;

	    @Autowired
	    public JsonPlaceholderController(JsonPlaceholderService jsonPlaceholderService) {
	        this.jsonPlaceholderService = jsonPlaceholderService;
	    }

	    @GetMapping("/posts/{id}")
	    public String getPostById(@PathVariable int id) {
	        return jsonPlaceholderService.getPostById(id);
	    }

   
}
