package com.example.shedule.service;

import com.example.shedule.domain.Shedule;
import com.example.shedule.repository.SheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SheduleService {
    @Autowired
    SheduleRepository repository;

    public List<Shedule> getShedule() {
        //do some smth
        return repository.getShedule();
    }
}

