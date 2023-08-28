package fr.aimcvent.economy.api;

import java.sql.Timestamp;

public interface Transaction {
    Wallet wallet();

    Devise devise();

    long amount();

    TransactionType type();

    String information();

    TransactionResult result();

    Timestamp createdAt();
}
