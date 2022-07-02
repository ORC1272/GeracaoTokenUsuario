package cro.avaliacaofilme.rest.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {
    @GetMapping(path = "/api/online"  )
    public String status(){
        return ("OnLine");
    }
}
