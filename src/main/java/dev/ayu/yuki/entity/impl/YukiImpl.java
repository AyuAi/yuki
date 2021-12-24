package dev.ayu.yuki.entity.impl;

import dev.ayu.yuki.Yuki;
import dev.ayu.yuki.entity.base.YukiDatabaseSupplier;
import dev.ayu.yuki.entity.base.YukiDiscordApi;
import dev.ayu.yuki.entity.base.YukiLogger;
import dev.ayu.yuki.entity.builder.YukiDiscordApiBuilder;

public final class YukiImpl implements Yuki {

    private final YukiDiscordApi api;
    private final YukiDatabaseSupplier databaseSupplier;
    private final YukiLogger logger;

    public YukiImpl(YukiDiscordApiBuilder api, YukiDatabaseSupplier databaseSupplier, YukiLogger logger) {
        this.api = api.setYuki(this).build();
        this.databaseSupplier = databaseSupplier;
        this.logger = logger;
    }

    @Override
    public YukiDiscordApi getDiscordApi() {
        return api;
    }

    @Override
    public YukiDatabaseSupplier getDatabaseSupplier() {
        return databaseSupplier;
    }

    @Override
    public YukiLogger getLogger() {
        return logger;
    }
}
