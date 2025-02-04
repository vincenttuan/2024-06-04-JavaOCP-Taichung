package com.example.websocket.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

import com.example.websocket.channel.ChatChannel;

@Configuration
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    @Bean  
    public ServerEndpointExporter serverEndpointExporter (){
        
        ServerEndpointExporter exporter = new ServerEndpointExporter();
        
        // 註冊 WebSocket 端點
        exporter.setAnnotatedEndpointClasses(ChatChannel.class);
        
        return exporter;
    }  
}
