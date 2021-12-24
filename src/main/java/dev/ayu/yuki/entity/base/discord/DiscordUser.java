package dev.ayu.yuki.entity.base.discord;

import dev.ayu.yuki.Yuki;
import dev.ayu.yuki.entity.base.YukiDiscordApi;
import org.javacord.api.entity.user.User;

import java.util.Optional;

public abstract class DiscordUser extends YukiDiscordEntity {

    public DiscordUser(Yuki yuki, YukiDiscordApi api) {
        super(yuki, api);
    }

    private long userId;
    private String username;
    private String discriminator;
    private String avatarHash;
    private long lastUpdatedAt;

    /**
     * @return The ID of this Discord User.
     */
    public long getId() {
        return this.userId;
    }

    /**
     * @return The name of this Discord User.
     */
    public String getName() {
        return this.username;
    }

    /**
     * @return The discriminator of this Discord User (4 digit identifier)
     */
    public String getDiscriminator() {
        return this.discriminator;
    }

    /**
     * @return The discriminated name of this Discord User (Ayu#0001)
     */
    public String getDiscriminatedName() {
        return this.username + "#" + this.discriminator;
    }

    /**
     * @return The raw avatar hash of this Discord User, if one is present.
     */
    public Optional<String> getAvatarHash() {
        return Optional.ofNullable(avatarHash);
    }

}
