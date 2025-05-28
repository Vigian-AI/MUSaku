package Vigian.Musaku.repository;

import Vigian.Musaku.entity.Musaku;

import java.util.ArrayList;

public interface MusakuRepository {




    ArrayList<Musaku> getAll();
    void getTotal();

    void add(Musaku musaku);
}
