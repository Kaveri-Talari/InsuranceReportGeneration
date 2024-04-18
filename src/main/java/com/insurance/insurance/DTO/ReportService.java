package com.insurance.insurance.DTO;

import com.insurance.insurance.entity.CitizenPlan;

import java.util.List;

public interface ReportService {

    //method to get planNames drop down data
    public List<String> getPlanNames();

    //method to get planNames drop down data
    public List<String> getPlanStatuses();

    //method to get list of CitizenPlan based on the search functionality what user select the fields
    public List<CitizenPlan> search(SearchRequest searchRequest);

    // To export the excel and boolean type for success or un-success of sending attachment mail
    public boolean exportExcel();

    // To export the PDF and boolean type for success or un-success of sending attachment mail
    public boolean exportPDF();

}
