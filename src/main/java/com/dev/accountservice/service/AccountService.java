package com.dev.accountservice.service;

import com.dev.accountservice.domain.Account;
import com.dev.accountservice.domain.Status;
import com.dev.accountservice.dto.AccountRequestDTO;
import com.dev.accountservice.dto.AccountResponseDTO;
import com.dev.accountservice.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final AccountRepository repository;

    public Mono<AccountResponseDTO> createAccount(AccountRequestDTO request){
        Account account = Account.builder()
                .accountNumber(request.getAccountNumber())
                .customerId(request.getCustomerId())
                .balance(request.getInitialBalance())
                .status(Status.ACTIVE)
                .build();

        return repository.save(account)
                .map(this::mapToResponse);
    }

    public Flux<AccountResponseDTO> findAll(){
        return repository.findAll().map(this::mapToResponse);
    }

    public AccountResponseDTO mapToResponse(Account account){
        return AccountResponseDTO.builder()
                .accountNumber(account.getAccountNumber())
                .balance(account.getBalance())
                .status(account.getStatus())
                .build();
    }

}
