package com.giantflyingsaucer.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

public class GWTCompositeExample implements EntryPoint
{
	public void onModuleLoad()
	{
		HorizontalPanel horizontalPanel = new HorizontalPanel();
		horizontalPanel.setSpacing(5);		
		
		Label label = new Label("I'm not a compposite control but there is one next to me -> ");
		label.addStyleName("mainLabel");
		
		horizontalPanel.add(label);
		horizontalPanel.add(new MyCompositeControl());
		RootPanel.get("mainDiv").add(horizontalPanel);
	}
}