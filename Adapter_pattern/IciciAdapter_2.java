package Adapter_pattern;

public class IciciAdapter_2 implements bankApi_2{
    private remoteIcici_2 icici = new remoteIcici_2();
    @Override
    public int chkBal() {
        int balget = icici.getBal();
        return balget;
    }

    @Override
    public int sendMoney(int x) {
        int cashsent = icici.moneysent(x);
        return cashsent;
    }

}
