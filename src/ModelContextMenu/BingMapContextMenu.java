package ModelContextMenu;

import javafx.collections.ObservableList;
import javafx.scene.control.MenuItem;

public class BingMapContextMenu extends ContextMenuModel{
	
	ObservableList<MenuItem> userLayerMenuItems = super.getMenuItems();
	
	 private String[] names = { "Bing", "Map", "Search", "Found" };
	
	public BingMapContextMenu() {
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
