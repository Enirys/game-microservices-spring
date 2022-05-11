package com.enirys.enirysagentsservice.repositories;

import com.enirys.enirysagentsservice.entities.Agent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgentsRepository extends JpaRepository<Agent, Long> {
}
