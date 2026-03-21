// ImageLoader.java

package com.kinetiq.utils;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageLoader {

    /**
     * Loads an image from the specified file path.
     * @param filePath the path to the image file
     * @return the loaded BufferedImage
     * @throws IOException if the image could not be loaded
     */
    public static BufferedImage loadImage(String filePath) throws IOException {
        File imageFile = new File(filePath);
        return ImageIO.read(imageFile);
    }

    /**
     * Saves a BufferedImage to a specified file path.
     * @param image the image to save
     * @param filePath the destination path for the image
     * @throws IOException if the image could not be saved
     */
    public static void saveImage(BufferedImage image, String filePath) throws IOException {
        File outputFile = new File(filePath);
        String formatName = filePath.substring(filePath.lastIndexOf('.') + 1);
        ImageIO.write(image, formatName, outputFile);
    }
}