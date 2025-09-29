package co.edu.uniquindio.poo.model;

public class CuentaAhorro extends Cuenta {

    private boolean activa;
    private static final float SALDO_MINIMO= 10000;

    public CuentaAhorro(float saldo, float porcentajeTasaAnual, boolean activa) {
        super(saldo, porcentajeTasaAnual);
        this.activa = saldo>=SALDO_MINIMO;
    }

    public void consignar(float valor){
        if (activa){
            super.consignar(valor);
        } else {
            System.out.println("La cuenta no esta activa, no se pueden hacer consignaciones");
        }
    }

    public void retirar(float valor){
        if (activa){
            super.retirar(valor);
        } else {
            System.out.println("La cuenta no esta activa, no se pueden hacer retiros");
        }
    }

    public void extractoMensual(){
        if (numeroRetiros>4){
            comisionMensual+=(numeroRetiros-4)*1000;  
        }
        super.extractoMensual();
        if (saldo>=SALDO_MINIMO){
            activa=true;
        } else {
            activa=false;
        }
    }

    public String toString() {
        int cantidadTransacciones= numeroConsignaciones+numeroRetiros;
        return "CUENTA AHORROS \n" +
                "activa=" + activa +
                ", saldo=" + getSaldo() +
                ", cantidad Transacciones=" + cantidadTransacciones +
                ", porcentajeTasaAnual=" + getPorcentajeTasaAnual() +
                ", comisionMensual=" + getComisionMensual() +
                '}';
    }

}


