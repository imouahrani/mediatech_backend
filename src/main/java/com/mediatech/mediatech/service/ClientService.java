package com.mediatech.mediatech.service;

import com.mediatech.mediatech.dao.ClientRequestDto;
import com.mediatech.mediatech.dao.ClientResponseDto;

public interface ClientService {
    ClientResponseDto save(ClientRequestDto clientRequestDto);

    ClientResponseDto findById(Integer id);


    ClientResponseDto findByNom(String nom);

    void delete(Integer id);

    ClientResponseDto update(ClientRequestDto clientRequestDto, Integer id);
}