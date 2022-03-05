package com.schooltech.genpro.services.implementation;

import com.schooltech.genpro.entities.Contract;
import com.schooltech.genpro.entities.Product;
import com.schooltech.genpro.services.ClientService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IClientTest {

    private ClientService clientService;

    public IClientTest(ClientService clientService){
        this.clientService = clientService;
    }

    @Test
    void getPrice() {

        double price = this.clientService.getPrice(1L, 1L);

        assertEquals(0.2, price);

    }
}