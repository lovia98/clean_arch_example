package com.example.clean_architecture.cleanarchi.bunckpal.account.app.port.in;

import com.example.clean_architecture.cleanarchi.bunckpal.account.domain.Account.AccountId;
import com.example.clean_architecture.cleanarchi.bunckpal.account.domain.Money;
import com.example.clean_architecture.cleanarchi.bunckpal.common.SelfValidating;
import jakarta.validation.constraints.NotNull;
import lombok.EqualsAndHashCode;
import lombok.Value;

@Value
@EqualsAndHashCode(callSuper = false)
public
class SendMoneyCommand extends SelfValidating<SendMoneyCommand> {

    @NotNull
    private final AccountId sourceAccountId;

    @NotNull
    private final AccountId targetAccountId;

    @NotNull
    private final Money money;

    public SendMoneyCommand(
            AccountId sourceAccountId,
            AccountId targetAccountId,
            Money money) {
        this.sourceAccountId = sourceAccountId;
        this.targetAccountId = targetAccountId;
        this.money = money;
        this.validateSelf();
    }
}