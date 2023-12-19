package ControllerContextMenu;

import ModelContextMenu.ContextMenuModel;
import ViewContextMenu.ContextMenuView;
import javafx.scene.Node;

public class ContextMenuController {
	
	private ContextMenuModel model;
	private ContextMenuView view;
	
	public ContextMenuController(ContextMenuModel model, ContextMenuView view) {
		this.model = model;
		this.view = view;
	}  
	
	public void showContextMenu(Node window, double x, double y) {
		
		this.view.initializeContextMenu(this.model.getMenuItems());
		
		this.view.getContextMenu().show(window, x, y);
	}
	
}
