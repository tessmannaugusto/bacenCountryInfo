package com.API.countryBankInfo.controllers;

import com.API.countryBankInfo.entities.PaisEntity;
import com.API.countryBankInfo.models.APIResponse;
import com.API.countryBankInfo.services.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/search")
public class APIController {

    @Autowired
    private PaisService paisService;

    @GetMapping("/findAllCountries")
    public ResponseEntity<List<PaisEntity>> findAll(){
        try {
            List<PaisEntity> result = paisService.findAll();
            return new ResponseEntity<>(result, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/findCountryByName/{nome}")
    public ResponseEntity<APIResponse> findByName(@PathVariable String nome){
        try {
            APIResponse result = paisService.findByName(nome);
            return new ResponseEntity<>(result, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/findCountryBySigla/{sigla}")
    public ResponseEntity<APIResponse> findBySigla(@PathVariable String sigla){
        try {
            APIResponse result = paisService.findBySigla(sigla);
            return new ResponseEntity<>(result, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
