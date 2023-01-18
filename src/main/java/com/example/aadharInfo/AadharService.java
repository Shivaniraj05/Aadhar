package com.example.aadharInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AadharService {
    @Autowired
    AadharRepository aadharRepository;

    public void addInfo(int id, String name) {

        aadharRepository.addInfo(id, name);
    }

    public String getNamebyId(int id) {

        return aadharRepository.getNameById(id);
    }
}
