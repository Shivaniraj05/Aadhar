package com.example.aadharInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class AadharController {

    @Autowired
    AadharService aadharService;


    @PostMapping("/addInfo")
    public String addInfo(@RequestParam("id") Integer id, @RequestParam("name")String name){
        aadharService.addInfo(id, name);
        return "Successfully added";
    }

    @GetMapping("/get_name_by_id")
    public String getNameById(@RequestParam("id") Integer id){
        return aadharService.getNamebyId(id);
    }
}
