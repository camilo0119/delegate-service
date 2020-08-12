/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mutualser.delegate.services;

import com.mutualser.delegate.model.dto.DoctorInfoDto;

/**
 *
 * @author camil
 */
public interface IDoctorDelegate {
    
    public DoctorInfoDto createDoctor(DoctorInfoDto doctorInfoDto);
    
}
