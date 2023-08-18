package Adapter_pattern;

public class phonePe {

    private bankApi_2 bankApi;

    phonePe(bankApi_2 bankApi) {
        this.bankApi = bankApi;
    }

    public void doSomething() throws InterruptedException {
        double currentBalance = bankApi.chkBal();
        Thread.sleep(25 * 24 * 60 * 60 * 1000);
        currentBalance = currentBalance*2;
    }
}
