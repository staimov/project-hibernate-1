package com.game.repository;

import com.game.entity.Player;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.springframework.stereotype.Repository;

import javax.annotation.PreDestroy;
import java.util.*;

@Repository(value = "db")
public class PlayerRepositoryDB implements IPlayerRepository {
    private final SessionFactory sessionFactory;

    public PlayerRepositoryDB() {
        Properties properties = new Properties();

        properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
        properties.put(Environment.USER, "root");
        properties.put(Environment.PASS, "root");
        properties.put(Environment.HBM2DDL_AUTO, "update");
        properties.put(Environment.DRIVER, "com.p6spy.engine.spy.P6SpyDriver");
        properties.put(Environment.URL, "jdbc:p6spy:mysql://localhost:3306/rpg");

        sessionFactory = new Configuration()
                .setProperties(properties)
                .addAnnotatedClass(Player.class)
                .buildSessionFactory();
    }

    @Override
    public List<Player> getAll(int pageNumber, int pageSize) {
        // TODO: implement with NativeQuery
        return null;
    }

    @Override
    public int getAllCount() {
        // TODO: implement with NamedQuery
        return 0;
    }

    @Override
    public Player save(Player player) {
        // TODO: implement with transaction commit
        return null;
    }

    @Override
    public Player update(Player player) {
        // TODO: implement with transaction commit
        return null;
    }

    @Override
    public Optional<Player> findById(long id) {
        // TODO: implement
        return Optional.empty();
    }

    @Override
    public void delete(Player player) {
        // TODO: implement with transaction commit
    }

    @PreDestroy
    public void beforeStop() {
        sessionFactory.close();
    }
}
