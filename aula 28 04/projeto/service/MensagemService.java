package com.example.projeto.service;
import.org.springframework.stereotype.service;
import.org.springframework.stereotype.MensagemService;

@Service
public class MensagemService{
    private final MensagemRepository mensagemRepository;

    public MensagemService(MensagemRepository mensagemRepository){
        this.mensagemRepository = mensagemRepository;
    }

    public String obterMensagem(){
        return mensagemRepository.obterMensagem();
    }

}