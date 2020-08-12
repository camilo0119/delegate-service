package com.mutualser.delegate.controller;

import com.mutualser.delegate.model.dto.DoctorInfoDto;
import com.mutualser.delegate.services.IDoctorDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctor")
public class DoctorInfoController {
    
    @Autowired
    IDoctorDelegate iDoctorDelegate;
    
    @PostMapping("/create")
    public DoctorInfoDto createDoc(@RequestBody final DoctorInfoDto doctorInfoDto) {
        return iDoctorDelegate.createDoctor(doctorInfoDto);
    }
    
}
