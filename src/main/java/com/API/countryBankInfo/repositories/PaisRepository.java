package com.API.countryBankInfo.repositories;

import com.API.countryBankInfo.entities.PaisEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaisRepository extends JpaRepository<PaisEntity, Integer> {

    PaisEntity findByNomeCompleto(String nomeCompleto);

    PaisEntity findBySigla(String sigla);
}
