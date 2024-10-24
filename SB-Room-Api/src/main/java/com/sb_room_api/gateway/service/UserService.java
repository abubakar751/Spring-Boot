package com.sb_room_api.gateway.service;
import com.sb_room_api.gateway.dao.UserRepo;
import com.sb_room_api.gateway.model.UserDto;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Log4j2
@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private ModelMapper modelMapper;
    @Value("${json.holder.api.response}")
    String urltoCallJsonHolder;

    public UserDto getApi(int id){
    String url = this.buildUrl(id);
        UserDto forObject = restTemplate.getForObject(url, UserDto.class);
        if(forObject != null){
            UserDto map = modelMapper.map(forObject, UserDto.class);
            return map;
        }
        log.info("api response holder");
        return null;
    }
private String buildUrl(int id ){
        return urltoCallJsonHolder+id;
}

}
