package dev.ayu.yuki.entity.base;

import dev.ayu.yuki.Yuki;

public abstract class YukiEntity {

    public YukiEntity(Yuki yuki) {
        this.yuki = yuki;
    }

    private final Yuki yuki;

    public Yuki getYuki() {
        return yuki;
    }

}
