/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mutualser.delegate.Feign;

import com.mutualser.delegate.model.dto.DoctorDto;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author camil
 */
@FeignClient(name="doctor", url="localhost:8086")
public interface DoctorFeign {
    
    @GetMapping("/doctor/create")
    public DoctorDto createDoctor(DoctorDto doctorDto);
    
}
