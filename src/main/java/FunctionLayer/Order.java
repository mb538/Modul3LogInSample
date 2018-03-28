package FunctionLayer;

public class Order {
    
    private int orderid;
    private String email;
    private int userid;
    private Wall stykliste;
    private int length;
    private int width;
    private int height;
    private boolean sent;

    public Order(int orderid, boolean sent) {
        this.orderid = orderid;
        this.sent = sent;
    }

    public Order(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Order(int userid, int length, int width, int height) {
        this.userid = userid;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Order(int orderid, int userid, int length, int width, int height, boolean sent) {
        this.orderid = orderid;
        this.userid = userid;
        this.length = length;
        this.width = width;
        this.height = height;
        this.sent = sent;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Wall getStykliste() {
        return stykliste;
    }

    public void setStykliste(Wall stykliste) {
        this.stykliste = stykliste;
    }

    public boolean isSent() {
        return sent;
    }

    public void setSent(boolean sent) {
        this.sent = sent;
    }
 
    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
