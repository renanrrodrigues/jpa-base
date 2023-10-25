import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class TestandoJPA {

    public static final String PERSISTENCE_UNIT_NAME = "teste-jpa";

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

        EntityManager manager = factory.createEntityManager();

        manager.getTransaction().begin();

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Scooby");

        manager.persist(pessoa);
        manager.getTransaction().commit(); // Esse commit é necessário para que o registro seja salvo no banco de dados

        manager.close();
        factory.close();
    }
}
