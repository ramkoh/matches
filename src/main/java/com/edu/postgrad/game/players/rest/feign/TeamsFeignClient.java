package com.edu.postgrad.game.players.rest.feign;

import com.edu.postgrad.game.common.Team;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "zuul-api-gateway")
public interface TeamsFeignClient {

    @GetMapping("teams-service/team/name/{name}")
    Team getTeamByName(@PathVariable String name);
}
