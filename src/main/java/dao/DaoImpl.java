package dao;

public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("version Base de donnees ");
        double t=25;
        return t;
    }
}
