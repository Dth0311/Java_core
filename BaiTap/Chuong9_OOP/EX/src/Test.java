public class Test {
    public static void main(String[] args) {
        AccountManagermentImp accManagerment = new AccountManagermentImp();

        Account account = new ActiveAccount("ABC01","haitit02","Danghai2002",true,false);
        accManagerment.signup(account);
        accManagerment.login(account);
        System.out.println("Sau khi đăng nhập: ");
        showAccountOnlineStatus(account);
        accManagerment.logout(account);
        System.out.println("Sau khi đăng xuất:");
        showAccountOnlineStatus(account);
    }

    private static void showAccountOnlineStatus(Account account) {
        ActiveAccount activeAccount = (ActiveAccount) account;
        var status = (activeAccount.isOnline()) ? " đang online" : " đang offline";
        System.out.println("Tài khoản " + activeAccount.getUsername() + status);
    }
}
