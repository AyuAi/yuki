package dev.ayu.yuki.entity.base;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public abstract class YukiLogger {

    /*
     * STATICS
     */

    private static final SimpleDateFormat DefaultLogDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ");

    private static String getDefaultTimestamp() {
        return DefaultLogDateFormat.format(Date.from(Instant.now()));
    }

    /*
     * Default YukiLogger
     */

    private final boolean debug;

    public YukiLogger(boolean debug) {
        this.debug = debug;
    }

    public boolean isDebugEnabled() {
        return this.debug;
    }

    public void errorLog(String message) {
        System.out.println(YukiLogger.getDefaultTimestamp() + " ERROR: " + message);
    }

    public void errorLog(Throwable exception) {
        System.out.println(YukiLogger.getDefaultTimestamp() + " ERROR: " + exception.getMessage());
        exception.printStackTrace();
    }

    public void errorLog(String message, Throwable exception) {
        System.out.println(YukiLogger.getDefaultTimestamp() + " ERROR: " + message + " " + exception.getMessage());
        exception.printStackTrace();
    }

    public void debugLog(String message) {
        if (this.isDebugEnabled()) {
            System.out.println(YukiLogger.getDefaultTimestamp() + " DEBUG: " + message);
        }
    }

    public void log(String message) {
        System.out.println(YukiLogger.getDefaultTimestamp() + " LOG: " + message);
    }

}
