package Chapter3;

class KataTest {

    KataTest kata = new KataTest();
    @Test

    public void weCanGetSquareTest() {

        Kata kata = new Kata();

        int result = kata.calculateSquare(8);

        assertEquals(64, result);


    }

    @Test

    public void weCanGetFactorial() {
        Kata kata = new Kata();

        int result = kata.calculateFactorial(3);

        assertEquals(6, result);

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number:");

        int userNumber = input.nextInt();
        Kata kata = new Kata();

        String Prompt = """
                 Press
                 1 --> find the square
                 2 --> find the factorial
                """;

        System.out.print(Prompt);
        int userInput = input.nextInt();
        if (userInput == 1) {
            System.out.println(kata.calculateSquare(userNumber));
        }
        if (userInput == 2) {
            System.out.println(kata.calculateFactorial(userNumber));
        }
    }

    @Test

    public void amountForAllCopies(){

        Kata kata = new Kata();
         int result =kata.calculatePriceFor(200);
        assertEquals(160000,result);

    }

    public static void main(String[] args) {
        int total = 0;
        int average = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter how many number you wan input");
        int numberOfGrade = scan.nextInt();

         int[] grade = new int[numberOfGrade];

          calculateTotalal


            }

                   System.out.println("The total number is "+ total);
                    System.out.println("The average number is "+ average);
                    calculateMaximum();



    }

    private static void calculateMaximum(int[] grade) {

        int maximumNumber = grade[0];
        for(int count = 1; count <= grade.length; count++){
            if(grade > maximumNumber){
                grade = maximumNumber;
            }
        }

    }

     public static int calculateMaximum(){
        int smallestNumber = grade[0];
        for(int counter = 0; counter < 10; counter++){


        }

    public static void main(String[] args) {

        int position = calculateHighScorePosition(600);
        displayHighScorePosition("kim",position);
         position = calculateHighScorePosition(700);
        displayHighScorePosition("mike",position);
         position = calculateHighScorePosition(200);
        displayHighScorePosition("dave",position);
         position = calculateHighScorePosition(60);
        displayHighScorePosition("timmy",position);



    }




    private static int calculateHighScorePosition(int playerScore) {

        if(playerScore > 1000){
            return 1;
        }
        if(playerScore > 500 && playerScore< 1000){
            return 2;
        }
        if(playerScore > 100 && playerScore < 500){
            return  3;
        }
        else {
            return 4;
        }



    }

    private static void displayHighScorePosition(String name, int position){

        System.out.println(name+ " manage to get into position "+ position +" in the high score table");


    }


}
}





















