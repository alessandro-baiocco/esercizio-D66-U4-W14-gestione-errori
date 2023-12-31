package BankClasses;

import exception.BancaException;

public class ContoCorrente {
    final int maxMovimenti = 50;
    String titolare;
    int nMovimenti;
    double saldo;

    public ContoCorrente(String titolare, double saldo) {
        this.titolare = titolare;
        this.saldo = saldo;
        nMovimenti = 0;
    }

    public void preleva(double x) throws BancaException {
        if (nMovimenti < maxMovimenti)
            if (saldo - x < 0.50) throw new BancaException("il conto è in rosso");
            else saldo = saldo - x;
        else
            saldo = saldo - x - 0.50;
        nMovimenti++;
    }

    public double restituisciSaldo() {
        return saldo;
    }
}