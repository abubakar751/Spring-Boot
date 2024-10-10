package gateWay.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class RestTempltService {
	private final RestTemplate restTemplate ;
	String urlString="https://jsonplaceholder.typicode.co m/posts/";
	
   public RestTempltService(RestTemplate restTemplate) {
	   this.restTemplate=restTemplate;
   }
 public  String getById(int id) {
	   String url=urlString+id;
	   
	return restTemplate.getForObject(url, String.class);
	   
   }
   
}
