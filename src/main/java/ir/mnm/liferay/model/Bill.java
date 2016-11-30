package ir.mnm.liferay.model;

/**
 * Created by mghasemy on 11/30/16.
 */
public class Bill {
    int id;
    String title;
    String desc;
    String price;
    String dt;
    String refrenceid;
    String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

    public String getRefrenceid() {
        return refrenceid;
    }

    public void setRefrenceid(String refrenceid) {
        this.refrenceid = refrenceid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
