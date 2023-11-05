package com.example.clean_architecture.cleanarchi.bunckpal.account.app.service;

import com.example.clean_architecture.cleanarchi.bunckpal.account.app.port.in.GetAccountBalanceQuery;
import com.example.clean_architecture.cleanarchi.bunckpal.account.app.port.out.LoadAccountPort;
import com.example.clean_architecture.cleanarchi.bunckpal.account.domain.Money;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@RequiredArgsConstructor
public class GetAccountBalanceService implements GetAccountBalanceQuery {

    private final LoadAccountPort loadAccountPort;

    @Override
    public Money getAccountBalance(AccountId accountId) {
        return loadAccountPort.loadAccount(accountId, LocalDateTime.now())
                .calculateBalance();
    }
}
