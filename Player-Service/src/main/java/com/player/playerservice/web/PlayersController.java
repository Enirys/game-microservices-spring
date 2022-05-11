package com.player.playerservice.web;

import com.player.playerservice.entities.Player;
import com.player.playerservice.repositories.PlayerRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlayersController {

    private PlayerRepository playerRepository;

    public PlayersController(PlayerRepository playerRepository)
    {
        this.playerRepository = playerRepository;
    }

    @GetMapping(path = "/players")
    public List<Player> getPlayers()
    {
        return playerRepository.findAll();
    }

    @GetMapping(path = "/players/{id}")
    public Player getPlayerById(@PathVariable Long id)
    {
        return playerRepository.findById(id).get();
    }

    @GetMapping(path = "/players/users/{userId}")
    public Player getPlayerByUserId(@PathVariable Long userId)
    {
        return playerRepository.getPlayerByUserId(userId);
    }

    @GetMapping(path = "/players/teams/{teamId}")
    public List<Player> getPlayersByTeamId(@PathVariable Long teamId)
    {
        return playerRepository.getPlayersByTeamId(teamId);
    }

    @PostMapping(path = "/players")
    public Player createPlayer(@RequestBody Player player)
    {
        return playerRepository.save(player);
    }

    @PutMapping (path = "/players/{id}")
    public Player updatePlayerById(@PathVariable Long id, @RequestBody Player player)
    {
        player.setId(id);
        return playerRepository.save(player);
    }

    @DeleteMapping(path = "/players/{id}")
    public void deletePlayerById(@PathVariable Long id)
    {
        playerRepository.deleteById(id);
    }

    @PostMapping(path = "/players/random/{teamId}/{numberPlayers}")
    public void createPlayers(@PathVariable Long teamId, @PathVariable int numberPlayers)
    {
        for (int i = 0; i < numberPlayers; i++)
        {
            long leftLimit = 2L;
            long rightLimit = 12L;
            long generatedLong = leftLimit + (long) (Math.random() * (rightLimit - leftLimit));
            playerRepository.save(new Player(null, generatedLong, Long.parseLong(i + ""), teamId));
        }
    }

}
