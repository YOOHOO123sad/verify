package verify;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("NethpotVerify เปิดใช้งานแล้ว!");
    }

    @Override
    public void onDisable() {
        getLogger().info("NethpotVerify ปิดใช้งานแล้ว!");
    }
}