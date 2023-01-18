package com.example.aadharInfo;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class AadharRepository {
    HashMap<Integer, String> aadharDb = new HashMap<>();

    public void addInfo(int id, String name){
        aadharDb.put(id, name);
    }
    public String getNameById(int id){
        if(aadharDb.containsKey(id))
            return aadharDb.get(id);
        else
            return "Name not found";
    }
}
