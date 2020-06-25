package Main;

import Control.Control;
import Control.ControlImpl;
import Model.Model;
import Model.ModelImpl;
import View.View;
import View.ViewImpl;

/**
 *
 * @author Cristian
 */
public class Main {
    
    public static void main(String[] args) {
        Model model = new ModelImpl();
        Control control = new ControlImpl(model);
        View view = new ViewImpl(control);
        view.start();
    }
    
}
