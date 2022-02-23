package com.API.countryBankInfo.controllers;

import com.API.countryBankInfo.entities.PaisEntity;
import com.API.countryBankInfo.models.APIResponse;
import com.API.countryBankInfo.services.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MockController {

    @Autowired
    private PaisService paisService;

    @PostMapping("/add")
    public ResponseEntity<?> addNewRegister(@RequestBody PaisEntity paisEntity){
        try {
            paisService.addCountryInfoRegister(paisEntity);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/addList")
    public ResponseEntity<?> addNewRegister(@RequestBody List<PaisEntity> paisEntityList){
        try {
            paisService.addCountryList(paisEntityList);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
