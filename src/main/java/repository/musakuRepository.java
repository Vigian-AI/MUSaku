package repository;

import entity.Musaku;

import java.util.List;

public interface musakuRepository {
    List<Musaku> getAll();
    void add(Musaku musaku);
}
