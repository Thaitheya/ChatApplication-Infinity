package com.web.chatapplication.love_you_infinite.entity;

import ch.qos.logback.classic.spi.LoggingEventVO;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatMessage {

    private MessageType type;
    private String content;
    private String sender;

}
