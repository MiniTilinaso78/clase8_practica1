public class CuentaBancaria {
    String numeroCuenta;
    String titular;
    double saldo;
    boolean activa;
    public void depositar(double monto){
        if (this.saldo>=0){
            this.saldo+=monto;
        }

    }
    public boolean retirar(double monto){
        if (this.saldo>=monto){
            this.saldo-=monto;
            return true;

        }else{
            System.out.println("Error saldo insuficiente ");
            return false;
        }
    }
    public void mostrarEstado(){
        String reporte = """
                Número de cuenta: %f
                Titular: %s
                Saldo: %f
                Cuenta Activa: %b
                """;
        System.out.println(reporte.formatted(this.numeroCuenta,this.titular,this.saldo,this.activa));
    }
}
