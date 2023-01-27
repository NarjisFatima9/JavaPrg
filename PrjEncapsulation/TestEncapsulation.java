//A Java class to test the encapsulated class Account.
public class TestEncapsulation {

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
