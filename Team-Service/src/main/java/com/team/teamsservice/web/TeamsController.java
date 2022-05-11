package com.team.teamsservice.web;

import com.team.teamsservice.entities.Team;
import com.team.teamsservice.repositories.TeamRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeamsController {

    private TeamRepository teamRepository;

    public TeamsController(TeamRepository teamRepository)
    {
        this.teamRepository = teamRepository;
    }

    @GetMapping(path = "/teams")
    public List<Team> getTeams()
    {
        return teamRepository.findAll();
    }

    @GetMapping(path = "/teams/{id}")
    public Team getItemById(@PathVariable Long id)
    {
        return teamRepository.findById(id).get();
    }

    @GetMapping(path = "/teams/matchs/{matchId}")
    public List<Team> getTeamsByMatchId(@PathVariable Long matchId)
    {
        return teamRepository.getTeamsByMatchId(matchId);
    }

    @PostMapping(path = "/teams")
    public Team createItem(@RequestBody Team team)
    {
        return teamRepository.save(team);
    }

    @PutMapping(path = "/teams/{id}")
    public Team updateItemById(@PathVariable Long id, @RequestBody Team team)
    {
        team.setId(id);
        return teamRepository.save(team);
    }

    @DeleteMapping(path = "/teams/{id}")
    public void deleteItemById(@PathVariable Long id)
    {
        teamRepository.deleteById(id);
    }
}
