package presenter;


import model.Showing;

import java.util.List;


public interface ShowingPresenter {

    Integer addShowing(Showing showing);

    void updateShowing(Showing showing);

    void removeShowing(Showing showing);

    List<Showing> getShowingList();

}
