
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.SQLException;

public class Product {
    public static EntityManagerFactory getConnection() throws SQLException {
        return Persistence.createEntityManagerFactory("vroemDatabase");
    }
}
