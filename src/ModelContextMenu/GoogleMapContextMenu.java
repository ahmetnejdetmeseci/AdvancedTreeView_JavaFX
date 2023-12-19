package ModelContextMenu;

import javafx.collections.ObservableList;
import javafx.scene.control.MenuItem;

public class GoogleMapContextMenu extends ContextMenuModel{
	ObservableList<MenuItem> userLayerMenuItems = super.getMenuItems();
	
	 private String[] names = { "Google", "Map", "C#", "Lalalala" };
	
	public GoogleMapContextMenu() {
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
