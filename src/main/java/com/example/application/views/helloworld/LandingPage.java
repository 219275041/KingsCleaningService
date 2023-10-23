package com.example.application.views.helloworld;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.dom.Style;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.flow.spring.annotation.UIScope;
import com.vaadin.flow.theme.lumo.LumoUtility;

@PageTitle("Home")
@Route(value = "")
@UIScope
public class LandingPage extends AppLayout {
    public LandingPage(){
        createNavBar();
        navlinks();

        H2 heading = new H2("Home:");

        Style headingStyle = heading.getStyle();
        headingStyle.set("margin-left", "auto");
        headingStyle.set("margin-right", "auto");

        // Trying to set a background image.
        Image home = new Image();
        home.setMaxWidth("800px");
        home.setMaxHeight("600px");
    }

    private void createNavBar(){
        H1 rental = new H1("Rental Real Estate Management");
        rental.addClassNames(
                LumoUtility.FontSize.LARGE,
                LumoUtility.Margin.AUTO);

        var header = new HorizontalLayout(new DrawerToggle(), rental);

        header.setDefaultVerticalComponentAlignment(FlexComponent.Alignment.CENTER);
        header.setWidthFull();
        header.addClassNames(
                LumoUtility.Padding.Vertical.NONE,
                LumoUtility.Padding.Horizontal.MEDIUM);
        addToNavbar(header);
    }

    private void navlinks() {
        VerticalLayout links = new VerticalLayout();
        RouterLink homeLink = new RouterLink("", LandingPage.class);
        homeLink.add(new Button("Home", VaadinIcon.HOME.create()));
        RouterLink contactLink = new RouterLink("", ContactView.class);
        contactLink.add(new Button("Contact", VaadinIcon.PHONE.create()));

        RouterLink serviceLink = new RouterLink("", ServiceView.class);
        serviceLink.add(new Button("Service", VaadinIcon.ARCHIVE.create()));

        RouterLink aboutLink = new RouterLink("", AboutUsView.class);
        aboutLink.add(new Button("about", VaadinIcon.ARCHIVE.create()));

        links.add(homeLink, contactLink, serviceLink, aboutLink);
        addClassNames("home-view");
        addToDrawer(links);
    }
}