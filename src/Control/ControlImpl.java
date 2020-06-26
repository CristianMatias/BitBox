package Control;

import Model.Model;

/**
 *
 * @author Cristian
 */
public class ControlImpl implements Control{
    private final Model model;

    public ControlImpl(Model model) {
        this.model = model;
    }

    @Override
    public boolean logUser(String name, String password) {
        return model.logUser(name, password);
    }
    
    
}
