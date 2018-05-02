package net.coolcode.gwt.mvp.client;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Label;

public class PanelA  extends FlowPanel {
	public PanelA() {
		String color = "green";
		getElement().setAttribute("style", "width: 600px; height: 100px; "
				+ "color: #FFFFFF; background-color: " + color + ";");
		add(new Label("MY LABEL 1"));
		GWT.log(PanelA.class + " color=" + color);
	}
}
