import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

import view.MainView;
import controller.MainController;

public class Main {
    public static void main(String[] args) throws Exception {
        MainController controller = new MainController();
        controller.initDummyData();

        MainView view = new MainView(controller);
        view.showMainMenu();
    }
}
