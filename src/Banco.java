
public class Banco {
    private String nome;
    private int numero;
    private Conta[] contas;

    public Banco(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
        this.contas = new Conta[10];
    }

    public void adiciona(Conta c) {
        for (int i = 0; i < contas.length; i++) {
            if (contas[i] == null) {
                contas[i] = c;
                return;
            }
        }
        System.out.println("Não foi possível adicionar: banco cheio");
    }

    public void mostraContas() {
        for (int i = 0; i < contas.length; i++) {
            if (contas[i] != null) {
                System.out.println(contas[i]);
            } else {
                System.out.println("Posição " + i + ": vazia");
            }
        }
    }

    public boolean contem(Conta conta) {
        for (Conta c : contas) {
            if (c == conta) {
                return true;
            }
        }
        return false;
    }
}