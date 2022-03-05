package com.schooltech.genpro.services.implementation;

import com.schooltech.genpro.entities.Contract;
import com.schooltech.genpro.entities.Product;
import com.schooltech.genpro.services.ClientService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IClientTest {

    @Test
    void getPrice() {
        Contract contract = new Contract();
        Product product = new Product();

        contract.setContract_id(1L);
        product.setProduct_id(1L);

        double response = (product.getCost_production() + contract.getMarge() + 0.2);

        assertEquals(12, response);

    }
}