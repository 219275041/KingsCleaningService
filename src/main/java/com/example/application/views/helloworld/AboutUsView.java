package com.example.application.views.helloworld;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("about-us")
public class AboutUsView extends VerticalLayout {
    public AboutUsView() {
        // Create and set the title
        H1 title = new H1("About Our Cleaning Company");
        title.getStyle()
                .set("text-align", "center")
                .set("color", "#FFBF00"); // Styling

        // Create and set the paragraph
        Paragraph paragraph = new Paragraph(
                "Welcome to Your Cleaning Company Name, your trusted partner for all your cleaning needs. " +
                        "We take pride in offering high-quality cleaning services to our valued customers. " +
                        "With years of experience and a dedicated team, we are committed to ensuring your home or business is clean, fresh, and inviting. " +
                        "Welcome to Kings Cleaning Services, your trusted partner for all your cleaning needs. " +
                        "We take pride in offering high-quality cleaning services to our valued customers. " +
                        "With years of experience and a dedicated team, we are committed to ensuring your home or business is clean, fresh, and inviting."
        );
        paragraph.getStyle()
                .set("text-align", "justify")
                .set("color", "#333"); // Styling

        addClassNames("contact-view");
        // Add components to the layout
        add(title, paragraph);

        // Set layout properties (alignment, spacing, etc.)
        setAlignItems(Alignment.CENTER);
        setSpacing(true);
        setSizeFull();
    }
}

