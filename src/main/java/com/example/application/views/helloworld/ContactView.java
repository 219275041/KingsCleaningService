package com.example.application.views.helloworld;


import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.map.configuration.style.Icon;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.dom.Style;
import com.vaadin.flow.router.Route;
@Route("contact")
public class ContactView extends VerticalLayout {
    public ContactView() {
        // Create a container for the header with a background bar
        Div headerContainer = new Div();
        headerContainer.addClassName("header-container"); // Add a CSS class for styling

        // Create the header (H1) element
        H1 title = new H1("Contact Us");
        title.addClassName("header-title"); // Add a CSS class for styling

        // Add the header to the container
        headerContainer.add(title);

        Style headingStyle = title.getStyle();
        headingStyle.set("margin-left", "auto");
        headingStyle.set("margin-right", "auto");

        // Create a HorizontalLayout to structure the content
        HorizontalLayout contentLayout = new HorizontalLayout();

        // Create a FormLayout for the form fields
        FormLayout formLayout = new FormLayout();
        TextField firstName = new TextField("First Name");
        TextField lastName = new TextField("Last Name");
        TextField phoneNumber = new TextField("Phone Number");
        EmailField email = new EmailField("Email");
        TextArea message = new TextArea("Message");

        firstName.setPlaceholder("Enter your first name");
        lastName.setPlaceholder("Enter your last name");
        phoneNumber.setPlaceholder("Enter your phone number");
        email.setPlaceholder("Enter your email");
        message.setPlaceholder("Enter your message");

        Button submitButton = new Button("Submit");
        submitButton.addClickListener(e -> {
            // Handle the form submission, e.g., send an email or store the message
            Notification.show("Message sent!");
        });

        // Add form fields to the FormLayout
        formLayout.add(firstName, lastName, phoneNumber, email, message);

        // Create a section for operating hours
        VerticalLayout operatingHoursSection = new VerticalLayout();
        operatingHoursSection.add(
                new H2("Operating Hours"),
                new Span("Monday: 9 AM - 5 PM"),
                new Span("Tuesday: 9 AM - 5 PM"),
                new Span("Wednesday: 9 AM - 5 PM"),
                new Span("Thursday: 9 AM - 5 PM"),
                new Span("Friday: 9 AM - 5 PM"),
                new Span("Saturday: 10 AM - 2 PM"),
                new Span("Sunday: Closed")
        );

        // Add social media icons to the top right corner
        // Create social media icons and set their colors

        // Set up the layout with proper alignment and spacing
        contentLayout.add(operatingHoursSection, formLayout);
        contentLayout.setFlexGrow(1, operatingHoursSection);
        contentLayout.setFlexGrow(1, formLayout);
        contentLayout.setAlignItems(Alignment.CENTER);

        // Create a container for the content layout
        Div contentContainer = new Div(contentLayout);
        contentContainer.addClassName("content-container"); // Add a CSS class for styling
        contentContainer.setWidth("100%");

        Style bg = submitButton.getStyle();
        bg.set("margin-left", "auto");
        bg.set("margin-right", "auto");
        bg.set("color", "white");
        bg.set("background-color", "Black");
        bg.set("border-radius", "8px");

         addClassNames("contact-view");
        // Set up the main layout with the header, content, and social media icons
        add(headerContainer, contentContainer, submitButton);
        setAlignItems(Alignment.CENTER);
    }
}
