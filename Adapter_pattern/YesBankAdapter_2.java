package Adapter_pattern;

public class YesBankAdapter_2 implements bankApi_2{
    private remoteYesBank_2 yes = new remoteYesBank_2();
    @Override
    public int chkBal() {
        int balget = yes.Balget();
        return balget;
    }

    @Override
    public int sendMoney(int x) {
        return yes.Cashsent(x);
    }
}
