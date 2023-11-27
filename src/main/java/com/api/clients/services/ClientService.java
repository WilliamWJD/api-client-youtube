package com.api.clients.services;

import com.api.clients.domain.Client;

public interface ClientService {
    /**
     * Find by id client.
     *
     * @param id the id
     * @return the client
     */
    Client findById(Long id);
}
