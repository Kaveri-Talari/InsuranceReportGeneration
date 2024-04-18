package com.insurance.insurance.DTO;

import com.insurance.insurance.Repository.CitizenPlanRepository;
import com.insurance.insurance.entity.CitizenPlan;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
public class ReportServiceImpl implements ReportService{

    @Autowired
    private CitizenPlanRepository planRepository;
    @Override
    public List<String> getPlanNames() {
        return planRepository.getPlanNames();//to get the planNames
    }

    @Override
    public List<String> getPlanStatuses() {
        return planRepository.getPlanStatus();//to get the planStatus
    }

    @Override
    public List<CitizenPlan> search(SearchRequest searchRequest) {
        //binding object to entity object(Dynamic query)
        CitizenPlan entity=new CitizenPlan();
        if(null!=searchRequest.getPlanName() && !"".equals(searchRequest.getPlanName())){
            entity.setPlanName(searchRequest.getPlanName());
        }
        if(null!=searchRequest.getPlanStatus() && !"".equals(searchRequest.getPlanStatus())){
            entity.setPlanName(searchRequest.getPlanStatus());
        }
        if(null!=searchRequest.getGender() && !"".equals(searchRequest.getGender())){
            entity.setPlanName(searchRequest.getGender());
        }
        if(null!=searchRequest.getPlanStartDate()){
            entity.setPlanStartDate(LocalDate.now());
        }
        BeanUtils.copyProperties(searchRequest,entity);
        return planRepository.findAll(Example.of(entity));
    }

    @Override
    public boolean exportExcel() {
        return false;
    }

    @Override
    public boolean exportPDF() {
        return false;
    }
}
