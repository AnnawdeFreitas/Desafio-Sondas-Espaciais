package com.elosete.modelo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;

import java.io.Serializable;

public class Sentido implements Serializable {
    private static final long serialVersionUID = -4060851020632500627L;
    private Movimentos movimentos;
    @JsonUnwrapped
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Posicao posicao;

    @JsonCreator
    public Sentido(@JsonProperty(value = "posicao") Posicao posicao,
                   @JsonProperty(value = "movimentos") Movimentos movimentos) {
        this.posicao = posicao;
        this.movimentos = movimentos;
    }

    public Posicao pegarPosicao() {
        return posicao;
    }

    public Movimentos pegarMovimentos() {
        return movimentos;
    }
}