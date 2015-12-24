package cn.cust.wpc.javaee.weixin.domain.UserManage;

/**
 * 用户组信息实体类
 */
public class Group {
    private long id;
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}