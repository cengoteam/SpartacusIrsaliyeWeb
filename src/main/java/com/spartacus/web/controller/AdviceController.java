package com.spartacus.web.controller;


import com.spartacus.web.business.AdviceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api/advice")

public class AdviceController {
    private final AdviceService adviceService;
    public AdviceController(AdviceService adviceService){
        this.adviceService = adviceService;
    }
    @GetMapping("/getEArchiveStatus/{uuid}/{documentType}")
    public String getEArchiveStatus(@PathVariable String uuid, @PathVariable String documentType){
        return adviceService.getStatus(uuid,documentType);
    }
}
