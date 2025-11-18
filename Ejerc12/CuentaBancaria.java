public class CuentaBancaria {
    private double saldo;
    public CuentaBancaria(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void mostrarSaldo() {
        System.out.println("EL saldo en tu cuenta bancaria es de: " + getSaldo());
    }
    
    public void depositar(double ingreso){
        this.saldo += ingreso;
    }

    public void retirar(double cantidad){
        if(getSaldo() < cantidad) {
            System.out.println("El saldo es insuficiente");
        } else {
            this.saldo -= cantidad;
        }
    }

    public static void main(String[] args) {
        CuentaBancaria cb = new CuentaBancaria(1000);
        cb.mostrarSaldo();
        cb.depositar(500);
        cb.mostrarSaldo();
        cb.retirar(1500);
        cb.mostrarSaldo();
    }
}
