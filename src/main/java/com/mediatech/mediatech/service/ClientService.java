package com.mediatech.mediatech.service;

import com.mediatech.mediatech.dao.ClientRequestDto;
import com.mediatech.mediatech.dao.ClientResponseDto;
import javassist.NotFoundException;

import java.util.List;

public interface ClientService {
    ClientResponseDto save(ClientRequestDto clientRequestDto);

    ClientResponseDto findById(Integer id);


    ClientResponseDto findByNom(String nom);

    void delete(Integer id);

    ClientResponseDto update(ClientRequestDto clientRequestDto, Integer id) throws NotFoundException;

    List<ClientResponseDto> findAll();
}