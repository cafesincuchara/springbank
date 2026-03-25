package com.dev.accountservice.controller;

import com.dev.accountservice.dto.AccountRequestDTO;
import com.dev.accountservice.dto.AccountResponseDTO;
import com.dev.accountservice.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("api/v1/accounts")
@RequiredArgsConstructor
public class AccountController {

    private final AccountService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<AccountResponseDTO> create(@RequestBody AccountRequestDTO request){
        return service.createAccount(request);
    }

    @GetMapping
    public Flux<AccountResponseDTO> getAll(){
        return service.findAll();
    }
}
