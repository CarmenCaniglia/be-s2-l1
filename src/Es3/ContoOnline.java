package Es3;

public class ContoOnline extends ContoCorrente{
    double maxPrelievo;
    ContoOnline(String titolare, double saldo, double maxP) {
        super(titolare, saldo);
        this.maxPrelievo = maxP;
    }

    void stampaSaldo(){
        System.out.println("Titolare: "+ titolare+ " - Saldo: " + saldo + " - Num Movimenti: "+nMovimenti+
                " - Massimo Movimenti: " + maxMovimenti+ " - Massimo prelievo Possibile: "+maxPrelievo);
    }

    void preleva(double x){
        if(x <= maxPrelievo){
            super.preleva(x);
        }
    }
}
