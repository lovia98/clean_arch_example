package com.example.clean_architecture.cleanarchi.bunckpal.account.addaper.in.web;

import com.example.clean_architecture.cleanarchi.bunckpal.account.app.port.in.SendMoneyCommand;
import com.example.clean_architecture.cleanarchi.bunckpal.account.app.port.in.SendMoneyUseCase;
import com.example.clean_architecture.cleanarchi.bunckpal.account.domain.Account.AccountId;
import com.example.clean_architecture.cleanarchi.bunckpal.account.domain.Money;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SendMoneyController {

    private final SendMoneyUseCase sendMoneyUseCase;

    @PostMapping(path = "/accounts/send/{sourceAccountId}/{targetAccountId}/{amount}")
    void sendMoney(
            @PathVariable("sourceAccountId") Long sourceAccountId,
            @PathVariable("targetAccountId") Long targetAccountId,
            @PathVariable("amount") Long amount) {

        SendMoneyCommand command = new SendMoneyCommand(
                new AccountId(sourceAccountId),
                new AccountId(targetAccountId),
                Money.of(amount));

        sendMoneyUseCase.sendMoney(command);
    }
}
