package com.mygdx.hastypastry.views;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Table;

public class InvalidVersionView extends BaseView {
    @Override
    public void buildStage() {
        // Set up font and label style
        BitmapFont headerFont = generateFont("pixelfont.TTF", 32);
        Label.LabelStyle headerLabelStyle = new Label.LabelStyle(headerFont, Color.BLACK);

        // Creates the header
        Label headerLabel = new Label("Old version!", headerLabelStyle);

        BitmapFont bodyFont = generateFont("pixelfont.TTF", 16);
        Label.LabelStyle bodyLabelStyle = new Label.LabelStyle(bodyFont, Color.BLACK);
        Label bodyLabel = new Label("To keep playing, you must\nget the latest version\nof the game", bodyLabelStyle);

        // Creates table
        Table table = new Table();
        table.setFillParent(true);
        table.add(headerLabel).padBottom(30);
        table.row();
        table.add(bodyLabel);

        // Adds table to ui
        this.ui.addActor(table);
    }
}