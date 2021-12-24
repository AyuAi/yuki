package dev.ayu.yuki.entity.builder;

import dev.ayu.yuki.Yuki;
import dev.ayu.yuki.entity.base.YukiDiscordApi;
import dev.ayu.yuki.entity.impl.javacord.YukiDiscordApiJavacordImpl;
import org.javacord.api.DiscordApi;

public final class YukiDiscordApiBuilder {

    private final Yuki yuki;
    private final YukiDiscordApi api;

    public YukiDiscordApiBuilder() {
        this(null, null);
    }

    private YukiDiscordApiBuilder(Yuki yuki, YukiDiscordApi api) {
        this.yuki = yuki;
        this.api = api;
    }

    public YukiDiscordApiBuilder setYuki(Yuki yuki) {
        return new YukiDiscordApiBuilder(yuki, api);
    }

    public YukiDiscordApiBuilder setApi(DiscordApi api) {
        return new YukiDiscordApiBuilder(yuki, new YukiDiscordApiJavacordImpl(yuki, api));
    }

    public YukiDiscordApi build() {
        return api;
    }

}
