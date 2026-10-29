public class PruebaCuenta {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA DE VALORES POR DEFECTO ===");
        CuentaBancaria c1 = new CuentaBancaria();
        c1.mostrarEstado(); // Observa los valores por defecto impresos (null, 0.0, false)
        System.out.println("\n=== CONFIGURANDO CUENTA 1 ===");
        c1.numeroCuenta = "CTA-001";
        c1.titular = "Ana Martínez";
        c1.activa = true;
        c1.depositar(1500.0);
        c1.mostrarEstado();
        System.out.println("\n=== CREANDO Y OPERANDO CUENTA 2 ===");
        CuentaBancaria c2 = new CuentaBancaria();
        c2.numeroCuenta = "CTA-002";
        c2.titular = "Carlos López";
        c2.activa = true;
        c2.depositar(500.0);
        c2.retirar(200.0);
        System.out.println("\n=== VERIFICACIÓN DE INDEPENDENCIA EN HEAP ===");
        c1.mostrarEstado();
        c2.mostrarEstado();

    }
}
/*¿Qué valores imprimió c1.mostrarEstado() en el primer paso antes de asignar valores a los atributos y por qué ocurrió esto?
  *Imprimio null, 0.00000 y false valores por defecto que les asigna java a las variables declaradas
¿Por qué la operación c2.retirar(200.0) no afectó en absoluto al saldo
de c1? Explica qué sucede internamente en la memoria Heap.
* Ya que se instanciaron dos objetos en la memoria heap con la palabra reservada 'new' c1 y c2 apuntaban a diferentes objetos por lo tanto una es independiente de la otra
*/