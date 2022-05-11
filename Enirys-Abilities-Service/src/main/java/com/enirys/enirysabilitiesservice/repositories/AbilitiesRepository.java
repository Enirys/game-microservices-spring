package com.enirys.enirysabilitiesservice.repositories;

import com.enirys.enirysabilitiesservice.entities.Ability;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AbilitiesRepository extends JpaRepository<Ability, Long> {

    @Query("SELECT abilit from ability abilit where abilit.agentId=?1")
    public List<Ability> getAbilityByAgentId(Long agentId);
}
