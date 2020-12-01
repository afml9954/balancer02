package co.edu.usta.lol.controller;

import co.edu.usta.lol.model.Champion;
import co.edu.usta.lol.repository.ChampionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/champions")
public class ChampionController {

    @Autowired
    private ChampionRepository championRepository;

    @GetMapping()
    public List<Champion> getAll(){
        return (List<Champion>) championRepository.findAll();
    }

    @PostMapping()
    public String save(@RequestBody Champion champion){
        try{
            championRepository.save(champion);
            return "Created by app01";
        }catch (Exception e){
            return "Error in app01";
        }
    }

}
