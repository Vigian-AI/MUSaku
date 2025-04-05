package Vigian.Musaku.repository;

import java.util.ArrayList;
import java.util.List;

public class MusakuRepositoryimpl implements MusakuRepository{
    private ArrayList<String> Musaku = new ArrayList<>();


    @Override
    public List<Vigian.Musaku.entity.Musaku> getAll() {
        return List.of();
    }

    @Override
    public void add(Vigian.Musaku.entity.Musaku musaku) {

    }
}
