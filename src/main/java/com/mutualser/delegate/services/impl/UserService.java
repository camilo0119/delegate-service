/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mutualser.delegate.services.impl;

import com.mutualser.delegate.Feign.UserFeign;
import com.mutualser.delegate.model.dto.UserDto;
import com.mutualser.delegate.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author camil
 */
@Service
public class UserService implements IUserService{
    
    @Autowired
    UserFeign userFeign;

    @Override
    public UserDto createUser(UserDto userDto) {
        return userFeign.createUser(userDto);
    }
    
}
