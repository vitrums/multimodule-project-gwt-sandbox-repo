package net.coolcode.gwt.client;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Label;

public class MyColorPanel extends FlowPanel {
	public MyColorPanel() {
		String color = "red";
		getElement().setAttribute("style", "width: 500px; height: 500px; "
				+ "color: #FFFFFF; background-color: " + color + ";");
		add(new Label("MY LABEL 1"));
		GWT.log(color);
	}
}
