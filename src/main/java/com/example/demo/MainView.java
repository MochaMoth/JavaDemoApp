package com.example.demo;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class MainView extends VerticalLayout
{
    private static final long serialVersionUID = 1L;

    public MainView()
    {
        Button button = new Button("Click me", event -> Notification.show("clicked!"));
        add(button);
    }
}