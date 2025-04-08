package Vigian.Musaku;

import Vigian.Musaku.repository.MusakuRepository;
import Vigian.Musaku.repository.MusakuRepositoryimpl;
import Vigian.Musaku.service.MusakuServiceimpl;
import Vigian.Musaku.service.MusakuService;
import Vigian.Musaku.viewmusaku.MusakuView;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        MusakuRepository musakuRepository = new MusakuRepositoryimpl();
        MusakuService musakuService =  new MusakuServiceimpl(musakuRepository);
        MusakuView musakuView = new MusakuView(musakuService);

        musakuView.showMenu();
    }

}
