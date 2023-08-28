package fr.aimcvent.economy.api;

import fr.aimcvent.kernel.api.service.Service;
import fr.aimcvent.player.api.Player;

public interface EconomyService extends Service {
    Transactions transactions();

    Wallet walletOf(Player player);

    Devise deviseOf(String devise);

    Devise deviseOf(String devise, boolean persistable);

    Pagination paginateOf(int page, int results);

    void unload(Player player);
}
