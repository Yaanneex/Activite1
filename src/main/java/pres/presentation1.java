package pres;
import dao.DaoImpl;
import metier.MetierImpl;

public class presentation1 {
    public static void main(String[] args) {
    DaoImpl d= new DaoImpl();
    MetierImpl metier = new MetierImpl(d);
    System.out.println("Res="+metier.calcul());
  
}
}

