import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.util.Scanner;

public class ColorDetector {

    public static void main(String[] args) throws IOException {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the name of the image file
        System.out.print("Enter the name of the image file: ");
        String fileName = scanner.nextLine();

        // Load the image
        BufferedImage image = ImageIO.read(new File(fileName));

        // Get the width and height of the image
        int width = image.getWidth();
        int height = image.getHeight();

        // Iterate over all the pixels in the image
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                // Get the RGB value of the pixel
                int rgb = image.getRGB(i, j);

                // Convert the RGB value to a Color object
                Color color = new Color(rgb);

                // Get the color name
                String colorName = color.getName();

                // Get the RGB values as separate variables
                int red = color.getRed();
                int green = color.getGreen();
                int blue = color.getBlue();

                // Calculate the brightness of the color
                int brightness = (red + green + blue) / 3;

                // Print the color name and brightness
                System.out.println("Color name: " + colorName + ", brightness: " + brightness);
            }
        }

        // Close the Scanner object
        scanner.close();
    }
}
