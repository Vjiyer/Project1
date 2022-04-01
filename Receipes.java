import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Receipes extends Order {
    private final static String RECEIPE_FILE = "RestaurentDataFiles/receipe.txt";

    public ArrayList<String> getMenuList() throws IOException {
        BufferedReader receipeFile = new BufferedReader(new FileReader(RECEIPE_FILE));
        String menu = receipeFile.readLine();
        ArrayList<String> availableReceipe = new ArrayList<String>();
        while(menu!= null) {
           String[] items = menu.split(" ");
//           for (int i = 0; i < items.length; i++)
//               System.out.print(items[i]+" ");
               // System.out.println(items[0].trim());
                availableReceipe.add(items[0].trim());
           menu = receipeFile.readLine();
         //  System.out.println(menu);
//            System.out.println("test " +menu.isEmpty());
       }
        receipeFile.close();
      // System.out.println(availableReceipe.toString());
        return availableReceipe;
    }
    public String checkAvailability(ArrayList<String> placedOrderList) throws IOException {
        Map<String, Map<String,Integer>> isIngradientsAvail = new HashMap<String,Map<String,Integer>>();
        Map<String,Integer> ingradientsList = new HashMap<String,Integer>();
        ArrayList<String> receipiesInFile =new  ArrayList<String>();
        BufferedReader receipeFile = new BufferedReader(new FileReader(RECEIPE_FILE));
        String menu = receipeFile.readLine();
        while(menu!= null) {
            String[] items = menu.split(" ");
            for(int i=0;i<menu.length();i++){
                if(i==0){
                    receipiesInFile.add(items[i]);
                }else
                {
                    ingradientsList.put(items[i],Integer.parseInt(items[i+1]));
                    i++;
                }
            }
            menu = receipeFile.readLine();
        }
        receipeFile.close();
       // isIngradientsAvail.put();
        return "";
    }

    public void abc(ArrayList<String> orderPlaced){

    }
}
