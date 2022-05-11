package com.enirys.enirysabilitiesservice.web;

import com.enirys.enirysabilitiesservice.entities.Ability;
import com.enirys.enirysabilitiesservice.repositories.AbilitiesRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AbilitiesController {
    private AbilitiesRepository abilitiesRepository;

    public AbilitiesController(AbilitiesRepository abilitiesRepository)
    {
        this.abilitiesRepository = abilitiesRepository;
    }

    @GetMapping(path = "/abilities")
    public List<Ability> getAbilities()
    {
        return abilitiesRepository.findAll();
    }

    @GetMapping(path = "/abilities/{id}")
    public Ability getAbilityById(@PathVariable Long id)
    {
        return abilitiesRepository.findById(id).get();
    }

    @GetMapping(path = "/abilities/agent/{agentId}")
    public List<Ability> getAbilityByAgentId(@PathVariable Long agentId)
    {
        return abilitiesRepository.getAbilityByAgentId(agentId);
    }

    @PostMapping(path = "/abilities")
    public void createItem(@RequestBody Ability agent)
    {
        abilitiesRepository.save(agent);
    }

    @PutMapping (path = "/abilities/{id}")
    public Ability updateItemById(@PathVariable Long id, @RequestBody Ability ability)
    {
        ability.setId(id);
        return abilitiesRepository.save(ability);
    }

    @DeleteMapping(path = "/abilities/{id}")
    public void deleteItemById(@PathVariable Long id)
    {
        abilitiesRepository.deleteById(id);
    }

}
