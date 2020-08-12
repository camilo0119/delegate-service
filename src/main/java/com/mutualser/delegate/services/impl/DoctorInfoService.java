/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mutualser.delegate.services.impl;

import com.mutualser.delegate.model.dto.DoctorDto;
import com.mutualser.delegate.model.dto.DoctorInfoDto;
import com.mutualser.delegate.model.dto.UserDto;
import com.mutualser.delegate.services.IDoctorDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author camil
 */
@Service
public class DoctorInfoService implements IDoctorDelegate {
    
    @Autowired
    DoctorService doctorService;
    
    @Autowired
    UserService userService;
    
    @Override
    public DoctorInfoDto createDoctor(DoctorInfoDto doctorInfoDto) {
      Long id = createUser(doctorInfoDto).getId();
      if (id != null) {
         createDoctor(id, doctorInfoDto);
      }
      return doctorInfoDto;
    }
    
    public UserDto createUser(DoctorInfoDto doctorInfoDto) {
        UserDto userDto = new UserDto();
        userDto.setName(doctorInfoDto.getName());
        userDto.setLastName(doctorInfoDto.getLastName());
        userDto.setPassword(doctorInfoDto.getPassword());
        userDto.setAge(doctorInfoDto.getAge());
        userDto.setEmail(doctorInfoDto.getEmail());
        return userService.createUser(userDto);
    }
    
    
    public DoctorDto createDoctor(Long id, DoctorInfoDto doctorInfoDto) {
        DoctorDto doctorDto = new DoctorDto();
        doctorDto.setIdUser(id);
        doctorDto.setNumberMedic(doctorInfoDto.getNumberMedic());
        doctorDto.setSpecialty(doctorInfoDto.getSpecialty());
        doctorDto.setStudies(doctorInfoDto.getStudies());
        return doctorService.createDoctor(doctorDto);
    }
}
