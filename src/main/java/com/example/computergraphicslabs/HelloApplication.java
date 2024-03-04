package com.example.computergraphicslabs;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) {
        int totalWidth = 600;
        int totalHeight = 300;

        Group container = new Group();
        Scene scene = new Scene(container, totalWidth, totalHeight);

        // Background
        Rectangle background = new Rectangle();
        background.setWidth(totalWidth);
        background.setHeight(totalHeight);
        background.setFill(Color.rgb(255, 217, 0));
        container.getChildren().add(background);

        // Left triangle
        Polygon leftTriangle = new Polygon();
        leftTriangle.getPoints().addAll(new Double[]{
                50.0, 50.0,
                225.0, 150.0,
                50.0, 250.0,
                100.0, 150.0 });
        leftTriangle.setFill(Color.rgb(0, 0, 255));
        container.getChildren().add(leftTriangle);

        // Right rectangle
        Polygon rightTriangle = new Polygon();
        rightTriangle.getPoints().addAll(new Double[]{
                475.0, 100.0,
                400.0, 150.0,
                475.0, 200.0,
                440.0, 150.0 });
        rightTriangle.setFill(Color.rgb(0, 0, 255));
        container.getChildren().add(rightTriangle);

        // Circle
        Circle circle = new Circle();
        circle.setRadius(30);
        circle.setCenterX(150);
        circle.setCenterY(150);
        circle.setFill(Color.rgb(255, 0, 0));
        container.getChildren().add(circle);

        // Lines
        int step = 5;
        int startHeight = 150 - step * 3;
        int endHeight = 150 + step * 3;

        for (int height = startHeight; height < endHeight; height+=step) {
            Line line = new Line(130, height, 430, height);
            container.getChildren().add(line);
        }

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}