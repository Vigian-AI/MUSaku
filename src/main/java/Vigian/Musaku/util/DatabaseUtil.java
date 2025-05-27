package Vigian.Musaku.util;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import io.github.cdimascio.dotenv.Dotenv;

import java.security.PublicKey;

public class DatabaseUtil {
    private static HikariDataSource hikariDataSource;
    static {
        Dotenv dotenv = Dotenv.load();
        String pass = dotenv.get("DB_password");


        HikariConfig config = new HikariConfig();
        config.setDriverClassName("com.mysql.cj.jdbc.Driver");
        config.setUsername("root");
        config.setPassword(pass);
        config.setJdbcUrl("jdbc:mysql://localhost:3306/musaku");

        config.setMaximumPoolSize(10);
        config.setMinimumIdle(5);
        config.setIdleTimeout(60000);
        config.setMaxLifetime(60*60000);


        hikariDataSource =new HikariDataSource(config);
    }
 
    public static HikariDataSource getDataSource(){
        return hikariDataSource;
    }
}
