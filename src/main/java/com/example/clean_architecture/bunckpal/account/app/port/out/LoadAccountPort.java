package com.example.clean_architecture.bunckpal.account.app.port.out;

import com.example.clean_architecture.bunckpal.account.domain.Account;
import com.example.clean_architecture.bunckpal.account.domain.Account.AccountId;

import java.time.LocalDateTime;

public interface LoadAccountPort {

    Account loadAccount(AccountId accountId, LocalDateTime baselineDate);
}
