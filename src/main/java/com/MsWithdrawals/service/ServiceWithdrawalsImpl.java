package com.MsWithdrawals.service;

import com.MsWithdrawals.model.Withdrawals;
import com.MsWithdrawals.repository.IWithdrawalsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ServiceWithdrawalsImpl implements IServiceWithdrawals {

    @Autowired
    IWithdrawalsRepository repository;

    @Override
    public Flux<Withdrawals> findAll() {
        return repository.findAll();
    }

    @Override
    public Mono<Withdrawals> save(Withdrawals withdraw) {
        return repository.save(withdraw);
    }
}
