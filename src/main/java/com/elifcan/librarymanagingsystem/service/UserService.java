package com.elifcan.librarymanagingsystem.service;

import com.elifcan.librarymanagingsystem.dto.request.DoLoginRequestDto;
import com.elifcan.librarymanagingsystem.dto.request.DoRegisterRequestDto;
import com.elifcan.librarymanagingsystem.entity.User;
import com.elifcan.librarymanagingsystem.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> getAll(){
        return userRepository.findAll();
    }

    public User doRegister(DoLoginRequestDto dto){
        User user = User.builder()
                .username(dto.userName())
                .password(dto.password())
                .email(dto.email())
                .build();
        userRepository.save(user);
        return user;
    }
}
