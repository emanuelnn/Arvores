public class Main {
    public static void main(String[] args) {
        int counterGreenTree = 0;
        int countRedTree = 0;

        TreeFactory tree = new TreeFactory();

        for (int i = 0; i < 500000;i++){
        Tree greenTree = tree.getTree(10,10,"Green","Cedro");
            counterGreenTree = counterGreenTree +1;
        };

        for (int i = 0; i < 500000;i++){
            Tree redTree = tree.getTree(10,10,"Red","Pinheiro");
            countRedTree = countRedTree +1;
        };

        System.out.println("Green Tree:" + counterGreenTree + "\n Red Tree:" + countRedTree);

        Runtime runtime = Runtime.getRuntime();
        System.out.println("Used Memory : " + (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024));
    }
}