/*A Java class to show usage of Main Method Account.
*User Narjis Fatima
*Date 1/27/2023
 */

public class UseOfMainMoethod {

        public static void main(String[] args) {
            //creating instance of BanckAccount class
            BanckAccount act=new BanckAccount();
            //setting values through setter methods
            act.setAct_num(10091);
            act.setName("Jahn Abraham");
            act.setAmount(5500f);
            //getting values through getter methods
            System.out.println(act.getAct_num()+" "+act.getName()+"  "+act.getAmount());
        }

    }


