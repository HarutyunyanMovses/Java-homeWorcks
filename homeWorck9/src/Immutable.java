import java.util.Date;

public class Immutable {

    private String name ;
    private Date date ;

    public Immutable(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return (Date) date.clone();
    }

}
