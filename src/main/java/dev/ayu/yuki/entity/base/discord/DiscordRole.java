package dev.ayu.yuki.entity.base.discord;

import dev.ayu.yuki.Yuki;
import dev.ayu.yuki.entity.base.YukiDiscordApi;

public abstract class DiscordRole extends YukiDiscordEntity {

    public DiscordRole(Yuki yuki, YukiDiscordApi api) {
        super(yuki, api);
    }
}
