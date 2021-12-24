package dev.ayu.yuki.entity.impl.javacord;

import dev.ayu.yuki.entity.base.discord.DiscordIcon;
import org.javacord.api.entity.Icon;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.concurrent.CompletableFuture;

public class DiscordIconJavacordImpl extends DiscordIcon implements Icon {

    public DiscordIconJavacordImpl() {
        super(null, null);
    }

    @Override
    public URL getUrl() {
        return null;
    }

    @Override
    public CompletableFuture<byte[]> asByteArray() {
        return null;
    }

    @Override
    public InputStream asInputStream() throws IOException {
        return null;
    }

    @Override
    public CompletableFuture<BufferedImage> asBufferedImage() {
        return null;
    }
}
