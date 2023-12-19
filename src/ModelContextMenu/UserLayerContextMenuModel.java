package ModelContextMenu;

import javafx.collections.ObservableList;
import javafx.scene.control.MenuItem;

public class UserLayerContextMenuModel extends ContextMenuModel{

	ObservableList<MenuItem> userLayerMenuItems = super.getMenuItems();
	
	 private String[] names = { "Add", "Delete", "Rename", "Clear" };
	
	public UserLayerContextMenuModel() {
		fillMenuItems();
	}
	
	@Override
	public void fillMenuItems() {
		for (String name : names) {
			MenuItem menuItem = new MenuItem(name);
			userLayerMenuItems.add(menuItem);
		}
	}

	
	
}
