package com.schooltech.genpro.services.implementation;

import java.util.List;

import com.schooltech.genpro.dao.ClientRepository;
import com.schooltech.genpro.entities.Client;
import com.schooltech.genpro.services.ClientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class IClient implements ClientService {
    
    @Autowired
    private ClientRepository clientRepo;

    /* public IClient(ClientRepository clientRepository){
        this.clientRepo = clientRepository;
    } */
    @Override
    public List<Client> getAllClients() {
        return this.clientRepo.findAll();
    }
}
