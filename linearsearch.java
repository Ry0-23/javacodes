import java.util.Scanner;
public class linearsearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] names= {"rvi", "zoey", "teve"};
        String target = "rvi";
        boolean isFound = false;

        for(int i=0; i<names.length; i++){


            if(names[i].equals(target)){
                System.out.println("element found : " + i);
                isFound = true;
                break;
            }

    }
    if(!isFound){
        System.out.println("elemet not found");
    }
    
}
}
