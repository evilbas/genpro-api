package com.schooltech.genpro.services;

import java.util.List;

import com.schooltech.genpro.entities.Client;

public interface ClientService {
    public List<Client> getAllClients();

    public double getPrice(Long contract_id, Long product_id);
    
}
