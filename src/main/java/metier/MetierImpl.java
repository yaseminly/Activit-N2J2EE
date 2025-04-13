package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements Imetier {
    @Autowired //pour faire l'injection d'obj
    //couplage faible
    private IDao dao;
    //l'injection necessite avoir qu un seul constr
    public MetierImpl( IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double t=dao.getData();
        double res=t*23;
        return res;
    }

    /**
     *pour injecter dans la variable dao un obj d'une classe qui implemente
     * l'intrf Idao
     */
    public void setDao(IDao dao) {  this.dao = dao; }
}
