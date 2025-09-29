package co.edu.uniquindio.poo.model;

public abstract class Cuenta{

protected float saldo;
protected int numeroConsignaciones= 0;
protected int numeroRetiros= 0;
protected float porcentajeTasaAnual;
protected float comisionMensual=0;

public Cuenta(float saldo, float porcentajeTasaAnual) {
    this.saldo = saldo;
    this.porcentajeTasaAnual = porcentajeTasaAnual;
}

public void consignar(float valor){
    if (valor>0){
        saldo+=valor;
        numeroConsignaciones++;
    }else{
        System.out.println("El valor a consignar debe ser positivo");
    }
}

public void retirar(float valor){
    if (valor>0){
        if (valor<=saldo){
            saldo-=valor;
            numeroRetiros++;
        }else{
            System.out.println("No hay saldo suficiente");
        }
    }else{
        System.out.println("El valor a retirar debe ser positivo");
    }
}

public void actualizarSaldo(){
    float tasaMensual= porcentajeTasaAnual/12;
    float interesesMensuales= saldo*tasaMensual;
    saldo+=interesesMensuales;
    saldo-=comisionMensual;
}

public void extractoMensual(){
    actualizarSaldo();
}

public float getSaldo() {
    return saldo;
}

public void setSaldo(float saldo) {
    this.saldo = saldo;
}

public int getNumeroConsignaciones() {
    return numeroConsignaciones;
}

public void setNumeroConsignaciones(int numeroConsignaciones) {
    this.numeroConsignaciones = numeroConsignaciones;
}

public int getNumeroRetiros() {
    return numeroRetiros;
}

public void setNumeroRetiros(int numeroRetiros) {
    this.numeroRetiros = numeroRetiros;
}

public float getPorcentajeTasaAnual() {
    return porcentajeTasaAnual;
}

public void setPorcentajeTasaAnual(float porcentajeTasaAnual) {
    this.porcentajeTasaAnual = porcentajeTasaAnual;
}

public float getComisionMensual() {
    return comisionMensual;
}

public void setComisionMensual(float comisionMensual) {
    this.comisionMensual = comisionMensual;
}

@Override
public String toString() {
return "CUENTA BANCARIA \n"+
"saldo=" + saldo +
"\n numeroConsignaciones=" + numeroConsignaciones +
"\n numeroRetiros=" + numeroRetiros +
"\n porcentajeTasaAnual=" + porcentajeTasaAnual +
"\n comisionMensual=" + comisionMensual + "\n";
}

}
