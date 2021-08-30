package com.umlaut.patterntraining.resources;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;
import java.util.Objects;

public class ImageResourceLoader {
    public static Image loadImageResource(String imageName) {
        try {
            ClassLoader classloader = Thread.currentThread().getContextClassLoader();
            return ImageIO.read(Objects.requireNonNull(classloader.getResourceAsStream(imageName)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
