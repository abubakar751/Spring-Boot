package gateway.service;

import gateway.dto.UserDto;
import gateway.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Service
public class JsonPlaceholderService {
	private final RestTemplate restTemplate;
    private final String BASE_URL = "https://jsonplaceholder.typicode.com/posts/";

    @Autowired
    public JsonPlaceholderService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getPostById(int id) {
        try {
            String url = BASE_URL + id;
            return restTemplate.getForObject(url, String.class);
        } catch (RestClientException e) {
            // Handle exceptions (e.g., log the error, throw a custom exception, etc.)
            e.printStackTrace();
            return null;
        }
    }
}
