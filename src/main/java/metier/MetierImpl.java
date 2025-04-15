package metier;
import dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao;
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }
    @Override
    public double calcul() {
        double t=dao.getData();
        double t1=t+43;
        return t1;
    }
    public void setDao(IDao dao) { this.dao = dao; }
}
