package com.rahat.BalanceTransferTask.expection;

public class InsuffientBalanceException extends RuntimeException{
    public InsuffientBalanceException(String message) {
        super(message);
    }
}
