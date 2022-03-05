package com.schooltech.genpro.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.*;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
@Getter
@Setter
@ToString
public class Contract implements Serializable {

    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="contract_id")
    private Long contract_id;

    @Column(name="type")
    private String type;

    @Column(name="marge")
    private double marge;

    @OneToMany(mappedBy="contract", fetch=FetchType.EAGER)
    private Collection<Client> clients;


    
}
