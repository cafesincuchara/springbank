package com.dev.accountservice.dto;

import com.dev.accountservice.domain.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccountResponseDTO {
    private String accountNumber;
    private BigDecimal balance;
    private Status status;

}
