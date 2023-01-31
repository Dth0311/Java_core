import java.util.ArrayList;

public class AccountManagermentImp implements AccountManagerment{
    private ArrayList<Account> accounts;

    public AccountManagermentImp() {
        accounts = new ArrayList<>();
    }

    public AccountManagermentImp(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public boolean signup(Account account) {
        if (!isExist(account)){
            accounts.add(account);
            return true;
        }
        return false;
    }

    private boolean isExist(Account account) {
        for (var acc: accounts) {
            if (acc.getUsername().compareTo(account.getUsername()) == 0){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean login(Account account) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).equals(account) && accounts.get(i) instanceof ActiveAccount){
                var activeAcc = (ActiveAccount) accounts.get(i);
                activeAcc.setOnline(true);// bật trạng thái online về false
                return true; // kết thúc
            }
        }
        return false;
    }

    @Override
    public void logout(Account account) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).equals(account) && accounts.get(i) instanceof ActiveAccount){
                var activeAcc = (ActiveAccount) accounts.get(i);
                activeAcc.setOnline(false); // bật trạng thái online về false
                break; // kết thúc
            }
        }
    }

    @Override
    public boolean removeAccount(Account account) {
        for (int i = 0; i < accounts.size(); i++) {
            if (account.equals(accounts.get(i))){
                accounts.remove(i);
                return true;
            }
        }
        return false;
    }
/*
* phương thức kích hoạt lại tài khoản đạng vô hiệu hóa
* Điều kiện active tk là nhập đúng mật khẩu và tài khoản
* chưa bị xóa khỏi hệ thống
*
* */
    @Override
    public boolean recoverAccount(Account account) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).equals(account) && accounts.get(i) instanceof ActiveAccount){
                var aciveAcc = (ActiveAccount) accounts.get(i);
                aciveAcc.setActive(true); // khôi phục lại tài khoản
                return true;
            }
        }
        return false;

    }

    @Override
    public boolean changePassword(Account account) {
        for (int i = 0; i < accounts.size(); i++) {
            var acc = accounts.get(i);
            if (acc.equals(account)){
                acc.setPassword(account.getPassword());
                return true; // xong thì thoát vì chỉ có một tài khoản thỏa mãn điều kiện
            }

        }
        return false;
    }
    /*
     * phương thức dùng để cập nhật thông tin tài khoản
     * giả sử ta chỉ update thông tin email và số đt
     * bạn có thể tự bổ sung cập nhật các thông tin khác
     * lưu ú khộng được đổi thông tin username*/
    @Override
    public void changeAccountInfor(Account account) {
        for (int i = 0; i < accounts.size(); i++) {
            var acc = accounts.get(i);
            if (acc.equals(account)) {
                acc.setEmail(account.getEmail());
                acc.setPhoneNumber(account.getPhoneNumber());
                break;
            }
        }
    }
}
