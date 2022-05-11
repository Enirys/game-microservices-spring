package com.match.matchservice.repositories;

import com.match.matchservice.entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchRepository extends JpaRepository<Match, Long> {
}
