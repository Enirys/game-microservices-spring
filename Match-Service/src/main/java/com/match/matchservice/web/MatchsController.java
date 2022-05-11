package com.match.matchservice.web;

import com.match.matchservice.entities.Match;
import com.match.matchservice.repositories.MatchRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MatchsController {

    private MatchRepository matchRepository;
    public MatchsController(MatchRepository matchRepository)
    {
        this.matchRepository = matchRepository;
    }

    @GetMapping(path = "/matchs")
    public List<Match> getMatchs()
    {
        return matchRepository.findAll();
    }

    @GetMapping(path = "/matchs/{id}")
    public Match getMatchById(@PathVariable Long id)
    {
        return matchRepository.findById(id).get();
    }

    @PostMapping(path = "/matchs")
    public Match createMatch()
    {
        Match match = new Match(null);
        return matchRepository.save(match);
    }

    @PutMapping (path = "/matchs/{id}")
    public Match updateMatchById(@PathVariable Long id, @RequestBody Match match)
    {
        match.setId(id);
        return matchRepository.save(match);
    }

    @DeleteMapping(path = "/matchs/{id}")
    public void deleteMatchById(@PathVariable Long id)
    {
        matchRepository.deleteById(id);
    }
}
