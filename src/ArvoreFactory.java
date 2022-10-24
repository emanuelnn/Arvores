import java.util.HashMap;
import java.util.Map;

    public class ArvoreFactory {
        private static Map<String,Arvore> macFlyweight = new HashMap<>();
        //Esse
        public Arvore getArvore(int altura, int largura,String cor, String tipo){
            String id = "Arvore: " + altura + " : "+ largura + " : " + cor + " : "+ tipo;
            System.out.println(id);
            if(!macFlyweight.containsKey(id)){macFlyweight.put(id,new Arvore(altura,largura,cor,tipo));
                return macFlyweight.get(id);
            }
            System.out.println("Arvore plantada com Sucesso, você salvou a natureza!!");
            return macFlyweight.get(id);
        }

}
