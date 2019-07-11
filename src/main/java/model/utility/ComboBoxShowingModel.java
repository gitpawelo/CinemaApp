package model.utility;

import model.Showing;

import javax.swing.*;
import java.util.List;


public class ComboBoxShowingModel extends DefaultComboBoxModel<Showing> {

    private List<Showing> showing;

    public ComboBoxShowingModel(List<Showing> showing) {
        this.showing = showing;
    }

    @Override
    public int getSize() {
        return showing.size();
    }

    @Override
    public Showing getElementAt(int index) {
        return showing.get(index);
    }

}
