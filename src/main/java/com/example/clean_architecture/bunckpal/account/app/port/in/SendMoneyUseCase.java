package com.example.clean_architecture.bunckpal.account.app.port.in;

public interface SendMoneyUseCase {

    public boolean sendMoney(SendMoneyCommand command);
}
