package kr.teamcocoa.mysql.main;

import kr.teamcocoa.mysql.mysql.MySQLManager;
import lombok.Getter;
import net.md_5.bungee.api.plugin.Plugin;

public class BungeeMySQLBootstrap extends Plugin {

    @Getter
    private static BungeeMySQLBootstrap instance;

    @Override
    public void onLoad() {
        instance = this;
    }

    @Override
    public void onEnable() {
        MySQLManager.startKeepAlive();
    }

    @Override
    public void onDisable() {
        MySQLManager.stopKeepAlive();
        MySQLManager.disconnectAllConnections();
    }
}
