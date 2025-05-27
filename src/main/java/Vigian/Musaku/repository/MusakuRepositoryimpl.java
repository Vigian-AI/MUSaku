package Vigian.Musaku.repository;

import Vigian.Musaku.entity.Musaku;
import Vigian.Musaku.util.DatabaseUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class MusakuRepositoryimpl implements MusakuRepository{

    @Override
    public ArrayList<Musaku> getAll() {
        ArrayList<Musaku> result = new ArrayList<>();

        String sql = "SELECT tipe, keterangan, nominal FROM transaksi";

        try (Connection connection = DatabaseUtil.getDataSource().getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet rs = statement.executeQuery()) {

            while (rs.next()) {
                String tipe = rs.getString("tipe");
                String keterangan = rs.getString("keterangan");
                int nominal = rs.getInt("nominal");

                result.add(new Musaku(tipe, keterangan, nominal));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }


    @Override
    public void add(Musaku musaku) {
        String sql = "INSERT INTO transaksi (tipe, keterangan, nominal) VALUES (?, ?, ?)";

        try (Connection connection = DatabaseUtil.getDataSource().getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, musaku.getTipe());
            statement.setString(2, musaku.getKeterangan());
            statement.setInt(3, musaku.getUang());

            statement.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
