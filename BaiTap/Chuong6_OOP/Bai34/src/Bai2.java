import java.util.ArrayList;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        int choice = 0;
        ArrayList<BankAccount> accounts = new ArrayList<>();
        var scanner = new Scanner(System.in);
        do {
            System.out.println("=================== MENU ===================");
            System.out.println("1. Thêm mới 1 tài khoản");
            System.out.println("2. Hiển thị thông tin tài khoản");
            System.out.println("3. Nạp thêm tiền vào tài khoản");
            System.out.println("4. Rút tiền từ tài khoản");
            System.out.println("5. Chuyển tiền từ tài khoản A đến tài khoản B");
            System.out.println("6. Tìm tài khoản theo tên tài khoản");
            System.out.println("7. Tìm tài khoản theo mã tài khoản");
            System.out.println("8. Tìm tài khoản với số dư >= x");
            System.out.println("9. Xóa một tài khoản theo mã cho trước");
            System.out.println("0. Thoát chương trình");
            System.out.println("Xin mời bạn chọn: ");
            choice = scanner.nextInt(); // nhập vào lựa chọn
            scanner.nextLine();
            switch (choice) {
                case 0:
                    System.out.println("Cam on ban da su dung dich vu");
                    break;
                case 1:
                    var acc = createNewAcc(scanner);
                    accounts.add(acc);
                    System.out.println("Them tai khoan thanh cong");
                    break;
                case 2:
                    showAccounts(accounts);
                    break;
                case 3:
                    if (accounts.size() > 0) {
                        System.out.println("Nhap ma TK can nap tien:");
                        var id = scanner.next();
                        System.out.println("Nhap so tien can nap:");
                        var amount = scanner.nextLong();
                        var isSuccess = deposit(accounts, id, amount);
                        if (isSuccess) {
                            System.out.println("==> Nap tien thanh cong <==");
                        } else {
                            System.out.println("Tai khoan khong ton tai" +
                                    " Hoac tai khoan khong hop le");
                        }
                    } else {
                        System.out.println("==> Danh sach nhan vien rong <==");
                    }
                    break;
                case 4:
                    if (accounts.size() > 0) {
                        System.out.println("Nhap ma Tk can rut tien:");
                        var id = scanner.next();
                        System.out.println("Nhap so tien can rut:");
                        var amount = scanner.nextLong();
                        var isSuccess = withDraw(accounts, id, amount);
                        if (isSuccess) {
                            System.out.println("==> Rut tien thanh cong <==");
                        } else {
                            System.out.println("==> Rut tien that bai");
                        }
                    } else {
                        System.out.println("Danh sach tai khoan rong");
                    }
                    break;
                case 5:
                    if (accounts.size() > 0) {
                        System.out.println("Nhap so tai khoan goc:");
                        var srcAccId = scanner.nextLine();
                        System.out.println("Nhap so tai khoan muon chuyen:");
                        var desAccId = scanner.nextLine();
                        System.out.println("Nhap so tien can chuyen:");
                        var amount = scanner.nextLong();
                        var isSuccess = bankTransfer(accounts, srcAccId, desAccId, amount);
                        if (isSuccess) {
                            System.out.println("Ban da chuyen khoan thanh cong");
                        } else {
                            System.out.println("==> Chuyen khoan that bai <==");
                        }
                    } else {
                        System.out.println("==> Danh sach tai khoan rong <==");
                    }
                    break;
                case 6:
                    if (accounts.size() > 0) {
                        var name = "";
                        System.out.println("Nhap ten tai khoan can tim =:");
                        name = scanner.next();
                        var result = searchByName(accounts, name);
                        if (result.size() > 0) {
                            System.out.println("==> Tim thay " + result.size() + " ket qua <==");
                            showAccounts(result);
                        } else {
                            System.out.println("==> Khong tim thay tai khoan nao ten " + name + "<==");
                        }
                    } else {
                        System.out.println("==> Danh sach tai khoan rong <==");
                    }
                    break;
                case 7:
                    if (accounts.size() > 0) {
                        System.out.println("Nhap ma tai khoan ban muon tim:");
                        var id = scanner.next();
                        var result = searchByAccId(accounts, id);
                        if (result != null) {
                            System.out.println("==> Tim thay ma id " + id + "<==");
                            showAcc(result);
                        } else {
                            System.out.println("Khong tim thay ma id la " + id);
                        }
                    } else {
                        System.out.println("==> Danh sach tai khoan rong <===");
                    }
                    break;
                case 8:
                    if (accounts.size() > 0) {
                        System.out.println("Nhap so du:");
                        var ballance = scanner.nextLong();
                        var result = searchByAccBallance(accounts, ballance);
                        if (result.size() > 0) {
                            System.out.println("Tim thay " + result.size() + " tai khoan");
                            showAccounts(result);
                        } else {
                            System.out.println("Khong tim thay tai khoan nao");
                        }
                    } else {
                        System.out.println("==> Danh sach tai khoan rong <==");
                    }
                    break;
                case 9:
                    if (accounts.size() > 0) {
                        System.out.println("Nhap ma tai khoan ban can xoa:");
                        var id = scanner.nextLine();
                        var isDeleted = removeAccById(accounts, id);
                        if (isDeleted) {
                            System.out.println("==> Xoa tai khoan thanh cong <==");
                        } else {
                            System.out.println("=> Xoa tai khoan that bai <==");
                        }

                    } else {
                        System.out.println("==> Danh sach tai khoan rong <==");
                    }
                    break;
                default:
                    System.out.println("==> Sai chuc nang, vui long nhap lai <==");
                    break;
            }
        } while (choice != 0);
    }

    private static boolean removeAccById(ArrayList<BankAccount> accounts, String id) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getId().compareTo(id) == 0) {
                accounts.remove(i);
                return true;
            }
        }
        return false;
    }

    private static ArrayList<BankAccount> searchByAccBallance(ArrayList<BankAccount> accounts, long ballance) {
        ArrayList<BankAccount> result = new ArrayList<>();
        for (var acc : accounts) {
            if (acc.getBallance() >= ballance) {
                result.add(acc);
            }
        }
        return result;
    }

    private static ArrayList<BankAccount> searchByName(ArrayList<BankAccount> accounts, String name) {
        ArrayList<BankAccount> res = new ArrayList<>();
        for (var acc : accounts) {
            if (acc.getOwner().toLowerCase().matches(".*" + name + ".*")) {
                res.add(acc);
            }
        }
        return res;
    }

    private static boolean bankTransfer(ArrayList<BankAccount> accounts, String srcAccId, String desAccId, long amount) {
        var srcAcc = searchByAccNumber(accounts, srcAccId);
        var desAcc = searchByAccNumber(accounts, desAccId);
        if (srcAcc != null && desAcc != null) {
            return srcAcc.bankTransfer(desAcc, amount);
        }
        return false;
    }

    private static BankAccount searchByAccNumber(ArrayList<BankAccount> accounts, String srcAccId) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccNumber().compareTo(srcAccId) == 0) {
                return accounts.get(i);
            }
        }
        return null;
    }

    private static boolean withDraw(ArrayList<BankAccount> accounts, String id, long amount) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getId().compareTo(id) == 0) {
                return accounts.get(i).withdraw(amount);
            }
        }
        return false;
    }

    private static boolean deposit(ArrayList<BankAccount> accounts, String id, long amount) {
        var acc = searchByAccId(accounts, id);
        if (acc != null) {
            return acc.deposit(amount);
        }
        return false;
    }

    private static BankAccount searchByAccId(ArrayList<BankAccount> accounts, String id) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getId().compareTo(id) == 0) {
                return accounts.get(i);
            }
        }
        return null;
    }

    private static void showAccounts(ArrayList<BankAccount> accounts) {
        if (accounts.size() > 0) {
            System.out.println("==> Danh sach tai khoan <==");
            System.out.printf("%-12s%-15s%-25s%-15s%-15s%-20s%-15s%-15s\n",
                    "Mã TK", "Số TK", "Tên TK", "Loại TK", "Số dư",
                    "Ngân hàng", "Ngày PH", "Ngày KT");
            for (var acc : accounts) {
                showAcc(acc);
            }
        } else {
            System.out.println("==> Danh sach tai khoan rong <==");
        }
    }

    private static void showAcc(BankAccount acc) {
        System.out.printf("%-12s%-15s%-25s%-15s%-15d%-20s%-15s%-15s\n",
                acc.getId(), acc.getAccNumber(), acc.getOwner(),
                acc.getType(), acc.getBallance(), acc.getBankName(),
                acc.getStartDate(), acc.getEndDate());
    }

    private static BankAccount createNewAcc(Scanner scanner) {
        System.out.println("Nhập mã tài khoản: ");
        var id = scanner.nextLine();
        System.out.println("Nhập số tài khoản: ");
        var number = scanner.nextLine();
        System.out.println("Nhập tên tài khoản: ");
        var owner = scanner.nextLine();
        System.out.println("Nhập loại tài khoản: ");
        var type = scanner.nextLine();
        System.out.println("Số dư: ");
        var amount = scanner.nextLong();
        scanner.nextLine(); // remove this line
        System.out.println("Tên ngân hàng phát hành: ");
        var bankName = scanner.nextLine();
        System.out.println("Ngày phát hành: ");
        var startDate = scanner.nextLine();
        System.out.println("Ngày hết hạn: ");
        var endDate = scanner.nextLine();

        BankAccount account = new BankAccount(id, number, owner, type,
                amount, bankName, startDate, endDate);
        return account;
    }
}
