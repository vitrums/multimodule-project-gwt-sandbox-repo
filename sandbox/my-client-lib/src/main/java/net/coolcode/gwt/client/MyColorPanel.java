package net.coolcode.gwt.client;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

import net.coolcode.gwt.mvp.weird.PanelB;

public class MyColorPanel extends FlowPanel {
	public MyColorPanel() {
		String color = "red";
		getElement().setAttribute("style", "width: 500px; height: 500px; "
				+ "color: #FFFFFF; background-color: " + color + ";");
		add(new Label("MY LABEL 1"));
		GWT.log(MyColorPanel.class + " color=" + color);
		RootPanel.get().add(new PanelB());
	}
}
