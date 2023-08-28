package fr.aimcvent.economy.api;

public interface TransactionBuilder {
    TransactionBuilder wallet(Wallet wallet);

    TransactionBuilder devise(Devise devise);

    TransactionBuilder amount(long amount);

    TransactionBuilder type(TransactionType type);

    TransactionBuilder information(String information);

    Transaction build();
}
