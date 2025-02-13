public class search {
    public static void main(String[] args) {
        

        int[] num = {1,3,45,63,66,21};
        int target = 45;
        boolean isFound = false;



        for(int i=0; i<num.length; i++){
            if(target ==num[i]){
                System.out.println("element forund:"  + i);
                isFound = true;
                break;
        }
    }
    if(!isFound){
        System.out.println("element not found in the array");
    }
}

}
