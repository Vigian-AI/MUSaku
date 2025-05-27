package Vigian.Musaku.Util;

import Vigian.Musaku.util.DatabaseUtil;
import com.zaxxer.hikari.HikariDataSource;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;

public class conection {
    @Test
    void tesConection()throws SQLException {
        HikariDataSource hikaridata= DatabaseUtil.getDataSource();
        Connection conect = hikaridata.getConnection();

        conect.close();
        hikaridata.close();

    }
}
