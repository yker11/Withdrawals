package com.MsWithdrawals.controller;

import com.MsWithdrawals.model.Withdrawals;
import com.MsWithdrawals.service.IServiceWithdrawals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class ControllerWithdrawals {

    @Autowired
    IServiceWithdrawals service;

    @GetMapping("/getWithdrawals")
    public Flux<Withdrawals> getWithdraw() {
        return service.findAll();
    }

    @PostMapping("/postWithdrawals")
    Mono<Withdrawals> postWithdraw(@RequestBody Withdrawals withdraw) {
        return service.save(withdraw);
    }

}
