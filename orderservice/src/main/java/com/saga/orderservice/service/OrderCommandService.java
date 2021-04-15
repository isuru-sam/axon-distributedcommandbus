package com.saga.orderservice.service;

import java.util.concurrent.CompletableFuture;

import com.saga.orderservice.commands.dto.OrderCreateDTO;

public interface OrderCommandService {

    public CompletableFuture<String> createOrder(OrderCreateDTO orderCreateDTO);

}
