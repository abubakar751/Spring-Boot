package com.sb_room_api.gateway.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserDto {
    private String userId;
    private String id;
    private String title;
    private String body;
}
