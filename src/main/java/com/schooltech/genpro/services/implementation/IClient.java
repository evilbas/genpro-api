package com.schooltech.genpro.services.implementation;

import java.util.List;

import com.schooltech.genpro.dao.ClientRepository;
import com.schooltech.genpro.entities.Client;
import com.schooltech.genpro.entities.Contract;
import com.schooltech.genpro.entities.Product;
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


    @Override
    public double getPrice(Long contract_id, Long product_id) {
        Contract contract = new Contract();
        Product product = new Product();

        contract.setContract_id(contract_id);
        product.setProduct_id(product_id);

        return (product.getCost_production() + contract.getMarge() + 0.2);
    }
}
