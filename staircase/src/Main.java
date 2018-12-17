public class Main {

    public static void main(String[] args) {

        int TOTAL_COUNT = 6;
        String FRONT_CODE = " ";
        String BACK_CODE = "#";

        for(int i = 0; i < TOTAL_COUNT; i++){


            for(int j = 0; j < TOTAL_COUNT; j++){

                if(j < TOTAL_COUNT - i - 1){
                    System.out.print(FRONT_CODE);
                }
                else{
                    System.out.print(BACK_CODE);
                }
            }

            System.out.println();
        }

    }
}
