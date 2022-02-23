package com.API.countryBankInfo.models;

import com.API.countryBankInfo.entities.PaisEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class APIResponse {

    private PaisEntity data;
}
