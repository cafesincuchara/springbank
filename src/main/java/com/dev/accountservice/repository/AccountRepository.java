package com.dev.accountservice.repository;

import com.dev.accountservice.domain.Account;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
@EnableR2dbcRepositories
public interface AccountRepository extends ReactiveCrudRepository<Account, Long> {

    Mono<Account> findByAccountNumber(String accountNumber);
    Mono<Boolean> existsByCustomerId(String customerId);

}
