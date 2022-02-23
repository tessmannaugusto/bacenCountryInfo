package com.API.countryBankInfo.services;

import com.API.countryBankInfo.entities.PaisEntity;
import com.API.countryBankInfo.models.APIResponse;
import com.API.countryBankInfo.repositories.PaisRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class PaisService {

    @Autowired
    private PaisRepository paisRepository;

    public List<PaisEntity> findAll(){
        return paisRepository.findAll();
    }

    public APIResponse findByName(String nomePais){
        APIResponse apiResponse = new APIResponse();
        try {
            PaisEntity paisEntity = paisRepository.findByNomeCompleto(nomePais);
            if (paisEntity != null){
                apiResponse.setData(paisEntity);
            }
            return apiResponse;
        }catch (Exception e){
            return apiResponse;
        }
    }

    public APIResponse findBySigla(String sigla){
        APIResponse apiResponse = new APIResponse();
        try {
            PaisEntity paisEntity = paisRepository.findBySigla(sigla);
            if (paisEntity != null){
                apiResponse.setData(paisEntity);
            }
            return apiResponse;
        }catch (Exception e){
            return apiResponse;
        }
    }

    public void addCountryInfoRegister(PaisEntity paisEntity){
        try{
            paisRepository.save(paisEntity);
        }catch (Exception e){
            log.error("Erro ao inserir informações do pais: " + paisEntity);
        }

    }

    public void addCountryList(List<PaisEntity> paisEntities){
        for (PaisEntity pais : paisEntities){
            paisRepository.save(pais);
        }
    }
}
