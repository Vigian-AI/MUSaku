package Vigian.Musaku.repository;

import Vigian.Musaku.entity.Musaku;

import java.util.ArrayList;
import java.util.List;

public class MusakuRepositoryimpl implements MusakuRepository{
    private ArrayList<Musaku> musaku = new ArrayList<>();
    @Override
    public ArrayList<Musaku> getAll() {
        return musaku;
    }


    @Override
    public void add(Musaku musaku) {
        this.musaku.add(musaku);
    }
}
