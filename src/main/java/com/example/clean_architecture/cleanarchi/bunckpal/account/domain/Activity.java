package com.example.clean_architecture.cleanarchi.bunckpal.account.domain;

import lombok.AllArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
public class Activity {
    public Activity(Account.AccountId id, Account.AccountId sourceAccountId, Account.AccountId id1, LocalDateTime now, Money money) {

    }
}
