package com.sb_room_api.gateway.dao;

import com.sb_room_api.gateway.model.UserDto;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository <UserDto,String >{
}
