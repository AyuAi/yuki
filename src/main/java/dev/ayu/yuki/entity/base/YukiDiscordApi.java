package dev.ayu.yuki.entity.base;

import dev.ayu.yuki.Yuki;
import org.javacord.api.DiscordApi;

import java.util.Optional;

public abstract class YukiDiscordApi extends YukiEntity {

    public YukiDiscordApi(Yuki yuki) {
        super(yuki);
    }

    public Optional<DiscordApi> toJavacord() {
        return Optional.empty();
    }

}
