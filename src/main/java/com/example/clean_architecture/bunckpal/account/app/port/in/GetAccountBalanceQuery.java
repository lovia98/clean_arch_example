package com.example.clean_architecture.bunckpal.account.app.port.in;

import com.example.clean_architecture.bunckpal.account.domain.Account.AccountId;
import com.example.clean_architecture.bunckpal.account.domain.Money;

public interface GetAccountBalanceQuery {
    Money getAccountBalance(AccountId accountId);
}
