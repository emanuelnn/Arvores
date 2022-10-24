public class Main {
    public static void main(String[] args) {
        int ContadorArvoreVerde = 0;
        int ContadorArvoreVermelha = 0;

        ArvoreFactory arvore = new ArvoreFactory();

        for (int i = 0; i < 500000;i++){
        Arvore arvoreVerde = arvore.getArvore(10,10,"Verde","Cedro");
        ContadorArvoreVerde = ContadorArvoreVerde +1;
        };

        for (int i = 0; i < 500000;i++){
            Arvore arvoreVermelha = arvore.getArvore(10,10,"Vermelha","Pinheiro");
            ContadorArvoreVermelha = ContadorArvoreVermelha +1;
        };

        System.out.println("Arvores Verdes:" + ContadorArvoreVerde + "\n Arvores Vermelhas:" + ContadorArvoreVermelha);

        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memória utilizada: " + (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024));
    }
}