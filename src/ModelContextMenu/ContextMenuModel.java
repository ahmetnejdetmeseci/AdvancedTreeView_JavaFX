package ModelContextMenu;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.MenuItem;

public abstract class ContextMenuModel {
	
	ObservableList<MenuItem> mainItems = FXCollections.observableArrayList();
	
	public ContextMenuModel() {}
	
	public void fillMenuItems() {}
	
	public ObservableList<MenuItem> getMenuItems(){
		return mainItems;
	}
}
