package com.mediatech.mediatech.service;

import com.mediatech.mediatech.dao.ClientDao;
import com.mediatech.mediatech.dao.ClientRequestDto;
import com.mediatech.mediatech.dao.ClientResponseDto;
import com.mediatech.mediatech.models.ClientEntity;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service()
public class ClientServiceImpl implements ClientService {
    private ClientDao clientDao;
    private ModelMapper modelMapper;

    public ClientServiceImpl(ClientDao clientDao, ModelMapper modelMapper) {
        this.clientDao = clientDao;
        this.modelMapper = modelMapper;
    }

    @Override
    public ClientResponseDto save(ClientRequestDto clientRequestDto) {
        ClientEntity clientEntity = modelMapper.map(clientRequestDto, ClientEntity.class);
        ClientEntity saved = clientDao.save(clientEntity);
        return modelMapper.map(saved, ClientResponseDto.class);
    }

    @Override
    public ClientResponseDto findById(Integer id) {
        ClientEntity clientEntity = clientDao.findById(id).orElseThrow(() -> new RuntimeException("Client not found"));
        return modelMapper.map(clientEntity, ClientResponseDto.class);
    }

    @Override
    public ClientResponseDto findByNom(String nom) {
        ClientEntity clientEntity = clientDao.findByNom(nom);
        return modelMapper.map(clientEntity, ClientResponseDto.class);
    }

    @Override
    public void delete(Integer id) {
        clientDao.deleteById(id);
    }

    //TODO update
    // TODO findAll
    @Override
    public ClientResponseDto update(ClientRequestDto clientRequestDto, Integer id) {
        return null;
    }
}