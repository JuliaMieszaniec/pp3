public class BankAcc {
    int money;
    int acc=0;
    String[] recenttransaction;
    

    void deposit(int money){
        acc+=money;
    }
    String withdrawal(int money){
        if(acc>=money){
            acc-=money;
            return "The withrowal is possible";
        }else{
            return "The withdrawall is impossible";
        }
    }
    String status(){
        return "Stan konta:" + acc;
    }
}
