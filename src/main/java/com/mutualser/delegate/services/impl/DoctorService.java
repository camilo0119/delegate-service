/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mutualser.delegate.services.impl;

import com.mutualser.delegate.Feign.DoctorFeign;
import com.mutualser.delegate.model.dto.DoctorDto;
import com.mutualser.delegate.services.IDoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author camil
 */
@Service
public class DoctorService implements IDoctorService {

    @Autowired
    DoctorFeign doctorFeign;
    
    @Override
    public DoctorDto createDoctor(DoctorDto doctorDto) {
        return doctorFeign.createDoctor(doctorDto);
    }
    
}
