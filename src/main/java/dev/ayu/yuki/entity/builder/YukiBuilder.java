package dev.ayu.yuki.entity.builder;

import dev.ayu.yuki.Yuki;
import dev.ayu.yuki.entity.impl.YukiImpl;
import dev.ayu.yuki.entity.base.YukiDatabaseSupplier;
import dev.ayu.yuki.entity.base.YukiDiscordApi;
import dev.ayu.yuki.entity.impl.DefaultYukiLoggerImpl;
import dev.ayu.yuki.entity.base.YukiLogger;

public final class YukiBuilder {

    private final YukiDiscordApiBuilder api;
    private final YukiDatabaseSupplier databaseSupplier;
    private final YukiLogger logger;

    public YukiBuilder() {
        this(null, null, new DefaultYukiLoggerImpl(true));
    }

    private YukiBuilder(YukiDiscordApiBuilder api, YukiDatabaseSupplier dbSupplier, YukiLogger logger) {
        this.api = api;
        this.databaseSupplier = dbSupplier;
        this.logger = logger;
    }

    public YukiBuilder setDiscordApi(YukiDiscordApiBuilder api) {
        return new YukiBuilder(api, databaseSupplier, logger);
    }

    public YukiBuilder setDiscordApi(org.javacord.api.DiscordApi api) {
        return new YukiBuilder(new YukiDiscordApiBuilder().setApi(api), databaseSupplier, logger);
    }

    public YukiBuilder setDatabaseSupplier(YukiDatabaseSupplier databaseSupplier) {
        return new YukiBuilder(api, databaseSupplier, logger);
    }

    public YukiBuilder setLogger(YukiLogger logger) {
        return new YukiBuilder(api, databaseSupplier, logger);
    }

    public Yuki build() {
        return new YukiImpl(api, databaseSupplier, logger);
    }
}
