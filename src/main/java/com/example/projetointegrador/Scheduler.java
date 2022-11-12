package com.example.projetointegrador;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@EnableScheduling
@Service
public class Scheduler {
    @Scheduled(initialDelay = 13880, fixedRate = 1500000)
    public void executeAgendamentos () {
        System.out.println("O agendamento foi iniciado");
    }
}
