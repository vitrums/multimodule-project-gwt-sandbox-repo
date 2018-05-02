package net.coolcode.gwt.mvp.weird;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Label;

public class PanelB  extends FlowPanel {
	public PanelB() {
		String color = "yellow";
		getElement().setAttribute("style", "position:absolute; left: 400px; top: 150px; "
				+ "width: 50px; height: 50px; "
				+ "color: #FFFFFF; background-color: " + color + ";");
		add(new Label("MY Weird 2"));
		GWT.log(PanelB.class + " color=" + color);
	}
}
