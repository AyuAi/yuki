package dev.ayu.yuki.entity.base.discord;

import dev.ayu.yuki.Yuki;
import dev.ayu.yuki.entity.base.YukiDiscordApi;

import java.util.Optional;

public abstract class DiscordIcon extends YukiDiscordEntity {

    public DiscordIcon(Yuki yuki, YukiDiscordApi api) {
        super(yuki, api);
    }

    public Optional<org.javacord.api.entity.Icon> toJavacord() {
        return Optional.empty();
    }

}
