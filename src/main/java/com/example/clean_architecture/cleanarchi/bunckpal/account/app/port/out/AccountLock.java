package com.example.clean_architecture.cleanarchi.bunckpal.account.app.port.out;

import com.example.clean_architecture.cleanarchi.bunckpal.account.domain.Account;

public interface AccountLock {

    void lockAccount(Account.AccountId accountId);

    void releaseAccount(Account.AccountId accountId);
}
