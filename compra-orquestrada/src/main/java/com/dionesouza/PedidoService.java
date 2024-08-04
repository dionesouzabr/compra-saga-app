package com.dionesouza;

import java.util.HashSet;
import java.util.Set;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PedidoService {

    private Set<Long> pedidos = new HashSet<>();

    public void newPedido(Long id){
        pedidos.add(id);
    }

    public void cancelPedido(Long id){
        pedidos.remove(id);
    }
}
