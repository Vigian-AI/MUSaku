package Vigian.Musaku;

import Vigian.Musaku.repository.MusakuRepository;
import Vigian.Musaku.repository.MusakuRepositoryimpl;
import Vigian.Musaku.service.MusakuServiceimpl;
import Vigian.Musaku.service.MuskuService;
import Vigian.Musaku.viewmusaku.MusakuView;

/**
 * Hello world!
 */
public class App {
    MusakuRepository musakuRepository = new MusakuRepositoryimpl();
    MuskuService musakuService =  new MusakuServiceimpl();
    static MusakuView musakuView = new MusakuView();

    public static void main(String[] args) {
        musakuView.showMenu();
    }

}
