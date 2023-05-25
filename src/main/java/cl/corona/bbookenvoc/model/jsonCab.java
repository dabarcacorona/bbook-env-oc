package cl.corona.bbookenvoc.model;

import java.util.List;

public class jsonCab {
    private List<jsonDet> data;

    public jsonCab() {
        super();
        // TODO Auto-generated constructor stub
    }

    public jsonCab(List<jsonDet> data) {
        super();
        this.data = data;
    }

    @Override
    public String toString() {
        return "JsonCab [data=" + data + "]";
    }

    public List<jsonDet> getData() {
        return data;
    }

    public void setData(List<jsonDet> data) {
        this.data = data;
    }

}
