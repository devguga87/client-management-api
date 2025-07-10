package com.devsuperior.client_management_api.services;

import com.devsuperior.client_management_api.dto.ClientDTO;
import com.devsuperior.client_management_api.entities.Client;
import com.devsuperior.client_management_api.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    private ClientRepository repository;

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id){
        Optional<Client> result = repository.findById(id);
        Client client = result.get();
        return new ClientDTO(client);
    }
}
