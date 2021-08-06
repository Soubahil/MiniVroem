import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Orderdetail {
    public static EntityManagerFactory getEMF() {
        return Persistence.createEntityManagerFactory("vroemDatabase");
    }
}