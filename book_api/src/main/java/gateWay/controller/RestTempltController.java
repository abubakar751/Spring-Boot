package gateWay.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gateWay.service.RestTempltService;


@RestController
@RequestMapping("/")
public class RestTempltController {
	private final RestTempltService restTempltService;
	public RestTempltController(RestTempltService restTempltService) {
		this.restTempltService=restTempltService;
	}
	
	  @GetMapping("/posts/{id}")
      String 	GetRestid(@PathVariable int id ) {
     	String byId = restTempltService.getById(id);
	    return byId;
}
	

}
