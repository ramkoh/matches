package com.edu.postgrad.game.players.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class MatchException extends RuntimeException {
    public MatchException(String message){
        super(message);
    }
}
