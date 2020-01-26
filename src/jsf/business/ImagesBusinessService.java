package jsf.business;


import jsf.data.ImageWrapper;
import jsf.data.ImagesWrapper;

import javax.annotation.PostConstruct;
import javax.ejb.Local;
import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.imageio.ImageIO;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Stateless
@Local(ImagesBusinessInterface.class)
public class ImagesBusinessService implements ImagesBusinessInterface{

    private Client client;
    private WebTarget target;
    private  Invocation.Builder invocationBuilder;
    Response response;

    List<ImageWrapper> list = new ArrayList<ImageWrapper>();
    ImageWrapper img = new ImageWrapper();
    public ImagesBusinessService(){
        init();
    }

    @PostConstruct
    protected void init() {
        client = ClientBuilder.newClient();
        target = client.target("http://localhost:8080/Service_war_exploded/rest/images/");
        invocationBuilder = target.request(MediaType.APPLICATION_JSON);
    }

    public void postImage() {
    }

    public void deleteImage(int id) {
    }

    public Object getImages() {
        Response r = target.request().get();
        Object o = r.readEntity(Object.class);
//        GenericEntity entity = new GenericEntity<List<ImageWrapper>>(list){};
        return o;

    }

    public ImageWrapper getImage(int id) {
        return img;
    }

    public BufferedImage ByteArrayToImage(byte[] data, String imageName) throws IOException {
        ByteArrayInputStream bis = new ByteArrayInputStream(data);
        BufferedImage bImage = ImageIO.read(bis);
        return bImage;
    }
}
