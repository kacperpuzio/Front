package jsf.data;

public class ImageWrapper {

    public ImageWrapper(){}

    public ImageWrapper(int id, String imageName, byte[] imageData){
        this.id = id;
        this.imageName = imageName;
        this.imageData = imageData;
    }
    private Integer id;
    private String imageName;
    private byte[] imageData;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public byte[] getImageData() {
        return imageData;
    }
    public void setImageData(byte[] imageData) {
        this.imageData = imageData;
    }

    public String getImageName() {
        return imageName;
    }
    public void setImageName(String imageName) {
        this.imageName = imageName;
    }
    @Override
    public String toString() {
        return this.imageName;
    }
}
