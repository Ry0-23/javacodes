public class array3 {
    public static void main(String[] args){
        //2d array = an array where each element is an array useful for storing a matrix of data

     String[] fruits ={"apple","orange","banana"};
     String[] vegetables ={"tomato","potato","carrot"};
     String[] meats ={"chicken","pork","beef"};

    

     String[][] groceries = {fruits,vegetables,meats};
      groceries[2][1]="brocolii";

     for(String[] foods: groceries){
        for(String food: foods){
            System.out.println(food + " ");


        }
       
        System.out.println();
     }

    }
    
}
