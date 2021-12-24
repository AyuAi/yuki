package dev.ayu.yuki.entity.base.discord;

import dev.ayu.yuki.Yuki;
import dev.ayu.yuki.entity.base.YukiDiscordApi;

public abstract class DiscordMember extends YukiDiscordEntity {

    public DiscordMember(Yuki yuki, YukiDiscordApi api) {
        super(yuki, api);
    }

}
