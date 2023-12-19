package ViewContextMenu;

import javafx.collections.ObservableList;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;

public class ContextMenuView extends ContextMenu{

	public void initializeContextMenu(ObservableList<MenuItem> items) {
		
		this.getItems().addAll(items);
		
	}
	
	public ContextMenu getContextMenu() {
		return this;
	}
	
}
