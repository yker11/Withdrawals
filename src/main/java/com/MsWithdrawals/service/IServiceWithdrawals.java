package com.MsWithdrawals.service;

import com.MsWithdrawals.model.Withdrawals;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IServiceWithdrawals {

    Flux<Withdrawals> findAll();

    Mono<Withdrawals> save(Withdrawals withdraw);
}
