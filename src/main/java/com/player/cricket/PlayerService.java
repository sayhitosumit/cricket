package com.player.cricket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {
    @Autowired
     private PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<Players> getAllPlayers(){
        return playerRepository.findAll();
    }

    public Players getById(int id){
        Optional<Players> result=playerRepository.findById(id);
        Players thePlayer=null;
        if(result.isPresent()){
            thePlayer=result.get();
        }
        else {
            throw new RuntimeException("Did not find the player Id");
        }

        return thePlayer;

    }

    public Players save(Players thePlayers) {
        return playerRepository.save(thePlayers);
    }

  public void deleteById(int theId){
        playerRepository.deleteById(theId);
  }


}
