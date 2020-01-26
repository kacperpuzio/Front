package jsf.business;


import jsf.data.ImageWrapper;

import javax.ejb.Local;
import java.util.List;

@Local
public interface ImagesBusinessInterface {
    public void postImage();

    public void deleteImage(int id);

    public Object getImages();

    public ImageWrapper getImage(int id);
}

