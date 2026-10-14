package DesafioContaBancaria;


public class conta {

    public String nome;
    public int numero;
    public String agencia;
    public double saldo;

    public String toString() {
        return "Nome: "+ nome + "\nNúmero: " + numero + "\nAgência: " + agencia + "\nSaldo: " + String.format("%.2f",saldo) + "R$";
    }
}
