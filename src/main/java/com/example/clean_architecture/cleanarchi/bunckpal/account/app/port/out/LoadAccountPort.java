package com.example.clean_architecture.cleanarchi.bunckpal.account.app.port.out;

import com.example.clean_architecture.cleanarchi.bunckpal.account.domain.Account;
import com.example.clean_architecture.cleanarchi.bunckpal.account.domain.AccountId;

import java.time.LocalDateTime;

public interface LoadAccountPort {

    Account loadAccount(AccountId accountId, LocalDateTime baselineDate);
}