import controller.Controller;
import model.Model;
import view.View;

public class Application {
    public static void main(String[] args) {
        Controller controller = new Controller(new Model(), new View());
    }
}
