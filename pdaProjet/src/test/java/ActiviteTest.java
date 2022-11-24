import com.pdaProjet.Dao.ActiviteDao;
import com.pdaProjet.Entitys.Activite;
import com.pdaProjet.Entitys.EtatEnum;
import com.pdaProjet.Util.JpaUtil;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ActiviteTest {
    EntityManager entityManager= JpaUtil.getEntityManagerFactory().createEntityManager();

    static long id;
    @Test
    @Order(1)
    void insertEntity(){
        Activite activite = new Activite();
        activite.setDescription("description activite");
        activite.setTitre("titre activite");
        activite.setDate_defin("22/22/2022");
        activite.setDate_debut("10/22/2022");
        activite.setEtat(EtatEnum.DESACTIVE);
        new ActiviteDao().insertEntity(activite);
        //assertInstanceOf==>Assert that the supplied actualValue is an instance of the expectedType.
        assertInstanceOf(Activite.class,activite);
        this.id=activite.getId();
        System.out.println(activite.toString());
        //Exemple 2
       /* Activite activite= new Activite();
        activite.setDescription("description activite");
        activite.setTitre("titre activite");
        activite.setDate_defin("22/22/2022");
        activite.setDate_debut("10/22/2022");
        activite.setEtat(EtatEnum.DESACTIVE);
        List<Activite>activites=entityManager.createQuery("select a from Activite a",Activite.class).getResultList();
        assertEquals(8,activites.size());
        for(Activite activite1 :activites){
            assertNotNull(activite1.getId());
        }
*/

            }

            @Test
            @Order(2)
            void findEntity(){
                System.out.println(id);
                assertInstanceOf(Activite.class,new ActiviteDao().findEntity(id));
            }
            @Test
            @Order(3)
            void showAllActivite(){
                assertInstanceOf(new ArrayList<Activite>().getClass(),new ActiviteDao().showAllActivite());
            }

            @Test
            @Order(4)
            void updateEntity(){
                Activite activite= new ActiviteDao().findEntity(id);
                activite.setEtat(EtatEnum.ACTIVE);
                activite.setTitre("titre 1");
                activite.setDescription("des 1");
                activite.setDate_defin("12/12/2030");
                activite.setDate_debut("12/12/2030");
                new ActiviteDao().updateEntity(activite);
                assertInstanceOf(Activite.class,activite);
            }

            @Test
            @Order(5)
            void removeEntity(){
                assertTrue(new ActiviteDao() .removeEntity(id));
            }


}
