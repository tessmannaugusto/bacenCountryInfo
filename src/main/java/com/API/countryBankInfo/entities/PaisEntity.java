package com.API.countryBankInfo.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@ToString
public class PaisEntity {

    @Id
    private String sigla;
    private String nomeCompleto;
    private Integer codigoBacen;
}
