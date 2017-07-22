package Ipwl.servertest4;

/**
 * 存一下东西
 * <serverlet>
 *<serverlet-name>login</serverlet-name>
 *<serverlet-class>Ipwl.servertest4.LoginServerlet</serverlet-class>
 *</serverlet>
 */
public class Entity {
    private String name;
    private String clz;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClz() {
        return clz;
    }

    public void setClz(String clz) {
        this.clz = clz;
    }
}
