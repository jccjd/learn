package Ipwl.servertest3;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lenovo on 2017/7/19.
 */
public class ServerletContext {
    private Map<String, Serverlet> serverlet;
    private Map<String, String> mapping;

    ServerletContext() {
        serverlet = new HashMap<>();
        mapping = new HashMap<>();
    }

    public Map<String, Serverlet> getServerlet() {
        return serverlet;
    }

    public void setServerlet(Map<String, Serverlet> serverlet) {
        this.serverlet = serverlet;
    }

    public Map<String, String> getMapping() {
        return mapping;
    }

    public void setMapping(Map<String, String> mapping) {
        this.mapping = mapping;
    }
}
