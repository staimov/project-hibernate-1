package com.game.config;

public class DBConstants {
    public static final String DB_DIALECT = "org.hibernate.dialect.MySQL8Dialect";
    public static final String DB_USER = "root";
    public static final String DB_PASS = "root";
    public static final String DB_HBM2DDL_AUTO = "update";
    public static final String DB_DRIVER = "com.p6spy.engine.spy.P6SpyDriver";
    public static final String DB_URL = "jdbc:p6spy:mysql://localhost:3306/rpg";

    //language=SQL
    public static final String SELECT_ALL_PLAYERS_SQL = "select * from rpg.player order by id";
}
