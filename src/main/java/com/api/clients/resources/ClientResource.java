package com.api.clients.resources;

import com.api.clients.domain.Client;
import com.api.clients.services.ClientService;
import com.api.clients.services.impl.ClientServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clients")
public class ClientResource {

    private final ClientService clientService;

    public ClientResource(final ClientServiceImpl clientServiceImpl){
        this.clientService = clientServiceImpl;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Client> findById(@PathVariable final Long id){
        return ResponseEntity.ok(clientService.findById(id));
    }
}
