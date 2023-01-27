//A Account class which is a fully encapsulated class.
//It has a private data member and getter and setter methods.
public class BanckAccount {

        //private data members
        private long act_num;
        private String name;
        private float amount;
        //public getter and setter methods
        public long getAct_num() {
            return act_num;
        }
        public void setAct_num(long act_num) {
            this.act_num = act_num;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

        public float getAmount() {
            return amount;
        }
        public void setAmount(float amount) {
            this.amount = amount;
        }


    }
