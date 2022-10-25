import java.util.HashMap;
import java.util.Map;

    public class TreeFactory {
        private static Map<String, Tree> macFlyweight = new HashMap<>();
        public Tree getTree(int heigth, int width, String color, String type){
            String id = "Tree: " + heigth + " : "+ width + " : " + color + " : "+ type;
            System.out.println(id);
            if(!macFlyweight.containsKey(id)){macFlyweight.put(id,new Tree(heigth,width,color,type));
                return macFlyweight.get(id);
            }
            System.out.println("Successfully planted tree, you saved nature!!");
            return macFlyweight.get(id);
        }

}
