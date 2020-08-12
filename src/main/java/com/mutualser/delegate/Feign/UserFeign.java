/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mutualser.delegate.Feign;

import com.mutualser.delegate.model.dto.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author camil
 */
@FeignClient(name="users", url="localhost:8083")
public interface UserFeign {
    
    @PostMapping(value = "/users/create")
    UserDto createUser(@RequestBody UserDto userDto);
    
}
