package com.example.views;

import io.dropwizard.views.View;

public class HomePage extends View {
    public HomePage() {
        super("index.mustache");
    }
}
