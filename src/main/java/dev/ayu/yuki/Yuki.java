package dev.ayu.yuki;

import dev.ayu.yuki.entity.base.YukiDatabaseSupplier;
import dev.ayu.yuki.entity.base.YukiDiscordApi;
import dev.ayu.yuki.entity.base.YukiLogger;

public interface Yuki {

    YukiDiscordApi getDiscordApi();

    YukiDatabaseSupplier getDatabaseSupplier();

    YukiLogger getLogger();

}