package repository;

import entity.Musaku;

import java.util.List;

public interface MusakuRepository {
    List<Musaku> getAll();
    void add(Musaku musaku);
}
