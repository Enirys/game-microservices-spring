package com.enirys.enirysagentsservice.web;

import com.enirys.enirysagentsservice.entities.Agent;
import com.enirys.enirysagentsservice.repositories.AgentsRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AgentsController {
    private AgentsRepository agentsRepository;

    public AgentsController(AgentsRepository agentsRepository)
    {
        this.agentsRepository = agentsRepository;
    }

    @GetMapping(path = "/agents")
    public List<Agent> getAgents()
    {
        return agentsRepository.findAll();
    }

    @GetMapping(path = "/agents/{id}")
    public Agent getAgentById(@PathVariable Long id)
    {
        return agentsRepository.findById(id).get();
    }

    @PostMapping(path = "/agents")
    public void createAgent(@RequestBody Agent agent)
    {
        agentsRepository.save(agent);
    }

    @PutMapping (path = "/agents/{id}")
    public Agent updateAgentById(@PathVariable Long id, @RequestBody Agent agent)
    {
        agent.setId(id);
        return agentsRepository.save(agent);
    }

    @DeleteMapping(path = "/agents/{id}")
    public void deleteAgentById(@PathVariable Long id)
    {
        agentsRepository.deleteById(id);
    }

}
