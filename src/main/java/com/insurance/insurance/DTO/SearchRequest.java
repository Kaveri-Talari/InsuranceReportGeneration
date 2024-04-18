package com.insurance.insurance.DTO;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
//search criteria come from UI to controller (form binding)
public class SearchRequest {

    //the objects coming from UI
    private String planName;
    private String planStatus;
    private String gender;
    private LocalDate planStartDate;
    private LocalDate planEndDate;

}
