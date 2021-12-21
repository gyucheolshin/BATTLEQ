package com.battleq.play.domain.response;

import com.battleq.play.domain.MessageType;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor

public class MessageBasicResponse {
    private LocalDateTime timestamp;
    private MessageType messageType;
    private String pin;
    private Object message;
    private String path;
}