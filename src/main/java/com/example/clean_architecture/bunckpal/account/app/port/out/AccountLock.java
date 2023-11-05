package com.example.clean_architecture.bunckpal.account.app.port.out;

import com.example.clean_architecture.bunckpal.account.domain.Account;

public interface AccountLock {

    void lockAccount(Account.AccountId accountId);

    void releaseAccount(Account.AccountId accountId);
}
