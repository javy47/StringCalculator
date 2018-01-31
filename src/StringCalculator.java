public class StringCalculator {


    int Add(String numbers) {

        String delims = "[, ^a-z]+";
        String[] Num = numbers.split(delims);

        int sum = 0;
        if (numbers.equals(" ")) {
            return 0;
        }
        if(Num.length == 1){
            sum = Integer.parseInt(Num[0]);
            return sum;


        }
        if( Num.length > 1){
            for(int i = 0; i < Num.length; i++){
                sum += Integer.parseInt(Num[i]);

            }


        }


        return sum;
    }
}

