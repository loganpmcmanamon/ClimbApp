package com.logan.climbappv2.controller;

import com.logan.climbappv2.model.Climb;
import com.logan.climbappv2.repository.ClimbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("climbs")
public class ClimbController {

    @Autowired
    ClimbRepository climbRepository;

    @GetMapping
    public List<Climb> getAll(){
        return climbRepository.findAll();
    }

    @GetMapping("/sent/{isSent}")
    public List<Climb> getSent(@PathVariable boolean isSent){
        return climbRepository.findByIsSent(isSent);
    }

    @GetMapping("/discipline/{discipline}")
    public List<Climb> getClimbByDiscipline(@PathVariable String discipline){
        return climbRepository.findByDiscipline(discipline);
    }

    @PostMapping
    public Climb createClimb(@RequestBody Climb climb){
        return climbRepository.save(climb);
    }

}
