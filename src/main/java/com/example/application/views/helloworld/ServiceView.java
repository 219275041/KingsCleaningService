package com.example.application.views.helloworld;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.dom.Style;
import com.vaadin.flow.router.Route;

@Route("service")
public class ServiceView extends VerticalLayout {
    public ServiceView() {
        // Title
        H1 title = new H1("Services Offered");
        Style headingStyle = title.getStyle();
        headingStyle.set("margin-left", "auto");
        headingStyle.set("margin-right", "auto");

        // Grid to display the services
        Grid<ServiceData> grid = new Grid<>(ServiceData.class);
        grid.setItems(
                new ServiceData("Bed", "images/Mattress.png"),
                new ServiceData("Couches", "images/Couches.png"),
                new ServiceData("Carpet", "images/Carpet.png")
                // Add more services as needed
        );

        grid.setColumns("serviceName");

        grid.addComponentColumn(serviceData -> {
            com.vaadin.flow.component.html.Image image = new com.vaadin.flow.component.html.Image(serviceData.getImageUrl(), serviceData.getServiceName());
            image.setWidth("300px"); // Set the image width as desired
            return image;
        }).setHeader("Image");
    addClassNames("contact-view");
        // Add the grid to the layout
        add(title, grid);
    }
}
