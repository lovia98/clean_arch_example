package com.example.clean_architecture.cleanarchi.bunckpal.account.app.port.in;

import com.example.clean_architecture.cleanarchi.bunckpal.account.domain.AccountId;
import com.example.clean_architecture.cleanarchi.bunckpal.account.domain.Money;

public interface GetAccountBalanceQuery {
    Money getAccountBalance(AccountId accountId);
}
