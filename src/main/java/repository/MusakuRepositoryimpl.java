package repository;

import entity.Musaku;

import java.util.ArrayList;
import java.util.List;

public class MusakuRepositoryimpl implements MusakuRepository{
    private ArrayList<String> Musaku = new ArrayList<>();


    @Override
    public List<entity.Musaku> getAll() {
        return List.of();
    }

    @Override
    public void add(entity.Musaku musaku) {

    }
}
