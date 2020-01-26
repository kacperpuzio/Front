package jsf.beans;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import jsf.data.ImageWrapper;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ValueChangeEvent;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jsf.business.ImagesBusinessService;

@ManagedBean(name="bean")
@SessionScoped
public class ImagesManagedBean implements Serializable {

    List<ImageWrapper> list = new ArrayList<ImageWrapper>();
    ImageWrapper selected;
    ImageWrapper img;
    ImagesBusinessService srv;
    private String msg; // status message
    private byte[] icon;


    public ImagesManagedBean() {
        loadImageNames();
    }
    private void loadImageNames(){
        srv = new ImagesBusinessService();
        list = (List<ImageWrapper>)srv.getImages();
    }

    public List<ImageWrapper> getList(){
        return list;
    }
    public void setList(List<ImageWrapper> list) {
        this.list = list;
    }
//    public String getSelected() {
//        return selected;
//    }
//    public void setSelected(String t) {
//        selected = t;
//    }
    public void setMessage(String s) {
        this.msg = s;
    }
    public String getMessage() {
        return msg;
    }
    public void setIcon(byte[] icon) {
        this.icon = icon;
    }
    public byte[] getIcon() {
        return icon;
    }

    public void valueChanged(ValueChangeEvent e) {
        Object i = e.getNewValue();


    }

}
