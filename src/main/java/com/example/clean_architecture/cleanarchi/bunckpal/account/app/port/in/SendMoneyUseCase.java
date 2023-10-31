package com.example.clean_architecture.cleanarchi.bunckpal.account.app.port.in;

public interface SendMoneyUseCase {

    public boolean sendMoney(SendMoneyCommand command);
}
