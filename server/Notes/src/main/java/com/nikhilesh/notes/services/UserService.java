package com.nikhilesh.notes.services;

import java.util.List;

import com.nikhilesh.notes.payload.NotesDto;
import com.nikhilesh.notes.payload.UserDto;
import com.nikhilesh.notes.payload.ApiRes;

public interface UserService {
    //create
    UserDto createUser(UserDto userDto);
    //update
    UserDto updateUser(UserDto userDto,Integer userId);
    //delete
    void deleteUser(Integer userId);
    //get
    UserDto getUser(Integer userId);
    //getAll
    List<UserDto> getAllUser();

    //user login
    UserDto userLogin(String email, String password);
    
}
