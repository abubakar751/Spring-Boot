package com.sb_room_api.dao;

import com.sb_room_api.model.Emplyee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmplyeeRepo extends JpaRepository<Emplyee, Integer> {
}
