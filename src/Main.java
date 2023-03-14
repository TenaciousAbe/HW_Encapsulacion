public class Main {
    public static void main(String[] args) {

        //Instancia de cuenta de banco
        CuentaBanco cuentaBanco = new CuentaBanco("Luis Lopez", 1000);

        //ACTIVIDAD:
        //Retirar 500
        System.out.println("Retiro 500. Saldo:");
        System.out.println(cuentaBanco.retiro(500));

        //Depositar 5,000
        System.out.println("Deposito 5000. Saldo:");
        System.out.println(cuentaBanco.deposito(5000));

        //Retirar  2,000
        System.out.println("Retiro 2000. Saldo:");
        System.out.println(cuentaBanco.retiro(2000));

        //Imprime el nombre del propietario de la cuenta
        System.out.println("Nombre:");
        System.out.println(cuentaBanco.getNombre());

        //Imprime el saldo actual del propietario
        System.out.println("Saldo FInal:");
        System.out.println(cuentaBanco.getSaldo());


    }
}