# project3
colour detectection 
//html  
<!DOCTYPE html>
<html>
<head>
    <title>Color Detection Website</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script>
        $(document).ready(function() {
            // Get the image
            var image = document.getElementById("image");

            // Create a color detector
            var colorDetector = new ColorDetector();

            // Listen for the click event on the image
            image.addEventListener("click", function(event) {
                // Get the coordinates of the click
                var x = event.clientX;
                var y = event.clientY;

                // Get the color at the clicked coordinates
                var color = colorDetector.getColor(image, x, y);

                // Display the color name
                document.getElementById("colorName").innerHTML = color.name;
                document.getElementById("rgb").innerHTML = color.rgb;
                document.getElementById("hex").innerHTML = color.hex;
            });
        });
    </script>
</head>
<body>
    <img id="image" src="image.jpg" alt="Image">
    <h1>Color Detection Website</h1>
    <p>Click on the image to detect the color at the clicked coordinates.</p>
    <p>Color name: <span id="colorName"></span></p>
    <p>RGB value: <span id="rgb"></span></p>
    <p>Hex value: <span id="hex"></span></p>
</body>
</html>
