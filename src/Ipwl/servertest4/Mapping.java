package Ipwl.servertest4;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *存映射
 *  <serverlet-mapping>
 *<serverlet-name>login</serverlet-name>
 *<url-pattern>/login</url-pattern>
 *<url-pattern>/g</url-pattern>
 *</serverlet-mapping>
 *
 */
public class Mapping {
    private String name;
    private List<String> urlPattern;

    public Mapping() {
        urlPattern = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getUrlPattern() {
        return urlPattern;
    }

    public void setUrlPattern(List<String> urlPattern) {
        this.urlPattern = urlPattern;
    }
}
