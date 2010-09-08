package com.giantflyingsaucer.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Image;

public class MyCompositeControl extends Composite implements ClickHandler
{
	private Label label = null;
	
	public MyCompositeControl()
	{		
		VerticalPanel verticalPanel = new VerticalPanel();
		initWidget(verticalPanel);
				
		final Image img = new Image(Resources.INSTANCE.gwtLogo());
		img.addClickHandler(this);
		this.label = new Label(" Click me or the image ");
		label.addClickHandler(this);

		verticalPanel.add(this.label);
		verticalPanel.add(img);		
	}
	
	@Override
	public void onClick(ClickEvent event)
	{
		if(event.getSource() == label)
			this.label.setText("You clicked the label");
		else
			this.label.setText("You clicked the image");
	}
}
