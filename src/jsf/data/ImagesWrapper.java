package jsf.data;

import java.util.ArrayList;
import java.util.List;

public class ImagesWrapper {
    private List<ImageWrapper> list = new ArrayList();
    public ImagesWrapper(){}
    public List<ImageWrapper> getList(){
        return list;
    }
    public void setList(List<ImageWrapper> list){
        this.list = list;
    }
}
