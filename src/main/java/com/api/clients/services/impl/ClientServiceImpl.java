package com.api.clients.services.impl;

import com.api.clients.domain.Client;
import com.api.clients.repositories.ClientRepository;
import com.api.clients.services.ClientService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {
    private final ClientRepository clientRepository;

    public ClientServiceImpl (final ClientRepository clientRepository){
        this.clientRepository = clientRepository;
    }

    @Override
    public Client findById(Long id) {
        Optional<Client> cliente = clientRepository.findById(id);
        return cliente.get();
    }
}
