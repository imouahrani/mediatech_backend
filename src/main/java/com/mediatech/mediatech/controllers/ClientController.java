package com.mediatech.mediatech.controllers;

import com.mediatech.mediatech.dao.ClientRequestDto;
import com.mediatech.mediatech.dao.ClientResponseDto;
import com.mediatech.mediatech.service.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("clients")
public class ClientController {

    private ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("")
    public List<ClientResponseDto> getClient() {
        return clientService.findAll();
    }

    @PostMapping("")
    public ClientResponseDto save(@RequestBody() ClientRequestDto clientRequestDto) {
        return clientService.save(clientRequestDto);
    }

}