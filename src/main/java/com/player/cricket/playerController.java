package com.player.cricket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/players")
public class playerController {
 @Autowired
private PlayerService playerService;

    public playerController(PlayerService playerService) {
        this.playerService = playerService;
    }
    @GetMapping("")
    public List<Players> getAllPlayers(){
        return playerService.getAllPlayers();
    }

    @GetMapping("/{id}")
    public Players getPlayerById(@PathVariable int id){
        return playerService.getById(id);
    }

    @PostMapping("")
    public Players  postPlayers(@RequestBody Players players){
        return playerService.save(players);
    }


    @DeleteMapping("/{id}")
    public String  deleteById(@PathVariable int id){

        Players players=playerService.getById(id);
        if(players== null)
        throw new RuntimeException("Player not found" +id );

         playerService.deleteById(id);
         return  " player got deleted Id " + id;


    }

}
