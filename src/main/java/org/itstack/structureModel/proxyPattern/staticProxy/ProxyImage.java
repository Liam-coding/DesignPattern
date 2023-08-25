package org.itstack.structureModel.proxyPattern.staticProxy;

public class ProxyImage implements Image{
    private RealImage realImage;
    private String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null){
            realImage = new RealImage(filename);
        }
        System.out.println("the class already was proxy");
        realImage.display();
    }
}
