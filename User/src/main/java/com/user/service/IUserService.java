package com.user.service;

import com.user.dto.UserDto;
import com.user.entity.User;

import java.util.List;

public interface IUserService {
     UserDto save(UserDto userDto);
     UserDto fetchDataById(int id);
     List<UserDto> getAll();
    UserDto updateData(int id, UserDto userDto);
    String deleteData(int id );
}
