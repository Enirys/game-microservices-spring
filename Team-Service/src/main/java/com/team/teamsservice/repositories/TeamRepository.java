package com.team.teamsservice.repositories;

import com.team.teamsservice.entities.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TeamRepository extends JpaRepository<Team, Long> {

    @Query("SELECT tea from team tea where tea.matchId=?1")
    public List<Team> getTeamsByMatchId(Long matchId);
}
