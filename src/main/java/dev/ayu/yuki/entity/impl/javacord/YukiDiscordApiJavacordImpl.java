package dev.ayu.yuki.entity.impl.javacord;

import dev.ayu.yuki.Yuki;
import dev.ayu.yuki.entity.base.YukiDiscordApi;
import org.javacord.api.DiscordApi;

import java.util.Optional;

public class YukiDiscordApiJavacordImpl extends YukiDiscordApi {

    public final DiscordApi javacordApi;

    public YukiDiscordApiJavacordImpl(Yuki yuki, DiscordApi api) {
        super(yuki);
        this.javacordApi = api;
    }

    @Override
    public Optional<DiscordApi> toJavacord() {
        return Optional.of(javacordApi);
    }

}
