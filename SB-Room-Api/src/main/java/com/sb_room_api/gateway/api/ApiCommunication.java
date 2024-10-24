package com.sb_room_api.gateway.api;

import com.sb_room_api.gateway.model.UserDto;
import com.sb_room_api.gateway.service.UserService;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class ApiCommunication {
   @Autowired
   private UserService userService;

    @GetMapping("/apiJson/{id}")
    public UserDto getUser(@PathVariable int id) {
        UserDto api = userService.getApi(id);
        if (api != null) {
            log.info("api's"+api);
            return api;
        }
return null;
    }
}
