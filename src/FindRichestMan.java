public class FindRichestMan {
    public static void main(String[] args) {
        int[][] accountsOfPeople = {
                {1,5},
                {7,3},
                {3,5},
                {99,1},
                {299,1}
        };
        //find out how much money each person has in all the banks.
        int max = Integer.MIN_VALUE;
        int riceshtPerson = 0;
        for (int person = 0; person < accountsOfPeople.length; person++) {
            int sum = 0;
            for (int account = 0; account < accountsOfPeople[person].length; account++) {
                //add the wealth in all accounts of a person;
                sum = sum + accountsOfPeople[person][account];
            }
            if (sum > max) {
                max = sum;
                riceshtPerson = person+1;
            }
        }
        System.out.println(riceshtPerson+" is the richest.with wealth of "+max);
    }
}
