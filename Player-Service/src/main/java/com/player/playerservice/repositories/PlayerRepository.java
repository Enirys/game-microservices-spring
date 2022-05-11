package com.player.playerservice.repositories;

import com.player.playerservice.entities.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PlayerRepository extends JpaRepository<Player, Long> {

    @Query("SELECT play from player play where play.teamId=?1")
    public List<Player> getPlayersByTeamId(Long teamId);

    @Query("SELECT play from player play where play.userId=?1")
    public Player getPlayerByUserId(Long userId);
}
