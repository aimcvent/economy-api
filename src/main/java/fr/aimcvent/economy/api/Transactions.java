package fr.aimcvent.economy.api;

import fr.aimcvent.economy.api.exception.TransactionException;

public interface Transactions {
    TransactionBuilder create();

    Transaction execute(Transaction transaction) throws TransactionException;
}
