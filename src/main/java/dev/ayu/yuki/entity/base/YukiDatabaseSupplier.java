package dev.ayu.yuki.entity.base;

import org.apache.commons.dbcp2.BasicDataSource;

public interface YukiDatabaseSupplier {

    BasicDataSource getBasicDataSource();

}
