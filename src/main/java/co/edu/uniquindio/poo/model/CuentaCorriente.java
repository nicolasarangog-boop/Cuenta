package co.edu.uniquindio.poo.model;

public class CuentaCorriente extends Cuenta {

    private float sobregiro;

    public CuentaCorriente(float saldo, float porcentajeTasaAnual) {
        super(saldo, porcentajeTasaAnual);
        this.sobregiro = 0;
    }

    public void retirar(float valor){
        if (valor>0 && valor<=saldo){
            super.retirar(valor);
        } else if (valor>saldo){
                float montoSobregiro= valor-saldo;
                sobregiro+=montoSobregiro;
                saldo=0;
                numeroRetiros++;
            } else {
            System.out.println("El valor a retirar debe ser positivo");
        }
    }

    public void consignar(float valor){
        super.consignar(valor);
        if (sobregiro>0){
            if (valor>=sobregiro){
                saldo+=valor-sobregiro;
                sobregiro=0;
            } else {
                sobregiro-=valor;
            }
        }
    }

    public void extractoMensual(){
        super.extractoMensual();
    }

    public String toString() {
        int cantidadTransacciones= numeroConsignaciones+numeroRetiros;
        return "CUENTA CORRIENTE \n" +
                ", saldo=" + getSaldo() +
                ", comisionMensual=" + getComisionMensual() +
                ", cantidad Transacciones=" + cantidadTransacciones +
                ", valor Sobregiro=" + sobregiro;
    }

}
