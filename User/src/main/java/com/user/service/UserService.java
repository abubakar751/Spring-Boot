package com.user.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.user.dto.UserDto;
import com.user.entity.User;
import com.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements IUserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ObjectMapper objectMapper;
    @Override
    public UserDto save(UserDto userDto) {
        User user = objectMapper.convertValue(userDto, User.class);
        User save = userRepository.save(user);
       return objectMapper.convertValue(save,UserDto.class);
    }

    @Override
    public UserDto fetchDataById(int id) {
        User byId = userRepository.findById(id).get();
      return   objectMapper.convertValue(byId,UserDto.class);

    }

    @Override
    public List<UserDto> getAll() {
        List<User> all = userRepository.findAll();
        ArrayList<UserDto> arrayListList = new ArrayList<>();
for(User  list:all){
    UserDto userDto = objectMapper.convertValue(list, UserDto.class);
    arrayListList.add(userDto);
}return arrayListList;

    }


    @Override
    public UserDto updateData(int id, UserDto user) {
        User byId = userRepository.findById(id).get();
        byId.setName(user.getName());
        byId.setEmail(user.getEmail());
        byId.setPassword(user.getPassword());
        User save = userRepository.save(byId);
      return   objectMapper.convertValue(save,UserDto.class);


    }

    @Override
    public String deleteData(int id) {
        User byId = userRepository.findById(id).get();
        if (byId != null){
            userRepository.deleteById(id);
        }else {
            throw  new RuntimeException(" Id Not Found");
        }
        return "deleted  data of "+id+" id";
    }

}
