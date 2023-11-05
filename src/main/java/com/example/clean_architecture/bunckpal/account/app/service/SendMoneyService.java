package com.example.clean_architecture.bunckpal.account.app.service;

import com.example.clean_architecture.bunckpal.account.app.port.in.SendMoneyCommand;
import com.example.clean_architecture.bunckpal.account.app.port.in.SendMoneyUseCase;
import com.example.clean_architecture.bunckpal.account.app.port.out.AccountLock;
import com.example.clean_architecture.bunckpal.account.app.port.out.LoadAccountPort;
import com.example.clean_architecture.bunckpal.account.app.port.out.UpdateAccountStatePort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SendMoneyService implements SendMoneyUseCase {

    private final LoadAccountPort loadAccountPort;
    private final AccountLock accountLock;
    private final UpdateAccountStatePort updateAccountStatePort;

    @Override
    public boolean sendMoney(SendMoneyCommand command) {
        return false;
    }
}
