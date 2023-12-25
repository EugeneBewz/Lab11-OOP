package ua.edu.ucu.apps.task3;

public class ProxyImage implements MyImage {
    private static MyImage myImage;
    private String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (myImage == null) {
            myImage = new RealImage(filename);
        }
        myImage.display();
    }
}
