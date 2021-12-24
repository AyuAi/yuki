package dev.ayu.yuki.entity.base.discord;

import dev.ayu.yuki.Yuki;
import dev.ayu.yuki.entity.base.YukiDiscordApi;
import dev.ayu.yuki.entity.base.YukiEntity;

public class YukiDiscordEntity extends YukiEntity {

    private final YukiDiscordApi api;

    public YukiDiscordEntity(Yuki yuki, YukiDiscordApi api) {
        super(yuki);
        this.api = api;
    }

    public YukiDiscordApi getApi() {
        return api;
    }
}
