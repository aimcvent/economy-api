package fr.aimcvent.economy.api;

import fr.aimcvent.player.api.Player;

import java.util.List;

public interface Wallet {
    Player player();

    long of(Devise devise);

    List<Transaction> transactions(Devise devise, Pagination pagination);
}
