# tictactoe

Xvfb :1 -screen 0 1024x768x24 &  # Start a virtual display
export DISPLAY=:1  # Set the display environment variable

# Run your Java application
java -jar YourApp.jar