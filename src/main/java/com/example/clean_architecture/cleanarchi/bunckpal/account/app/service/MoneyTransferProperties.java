package com.example.clean_architecture.cleanarchi.bunckpal.account.app.service;

import com.example.clean_architecture.cleanarchi.bunckpal.account.domain.Money;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MoneyTransferProperties {
    private Money maximumTransferThreshold = Money.of(1_000_000L);
}
