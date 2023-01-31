package Ex1;

import Ex1.Comparator.SortByHeightDESC;
import Ex1.Comparator.SortByName;
import Ex1.Comparator.SortByWeightASC;
import Ex1.Comparator.SortByWeightDESC;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int choice = 0;
        var input = new Scanner(System.in);
        var animals = new ArrayList<Animal>();
        do {
            System.out.println("=================== MENU ===================");
            System.out.println("1. Thêm 1 động vật vào danh sách");
            System.out.println("2. Hiển thị danh sách động vật ra màn hình");
            System.out.println("3. Sắp xếp động vật theo tên a-z");
            System.out.println("4. Sắp xếp động vật theo chiều cao giảm dần");
            System.out.println("5. Sắp xếp động vật theo cân nặng giảm dần");
            System.out.println("6. Sắp xếp động vật theo cân nặng tăng dần");
            System.out.println("0. Thoát chương trình");
            choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 0:
                    showMessage("Cảm ơn bạn đã sử dụng dịch vụ!");
                    break;
                case 1:
                    Animal animal = createAnimal(input);
                    if (animal == null) {
                        showMessage("Tạo đối tượng thất bại");
                    } else {
                        animals.add(animal);
                        System.out.println("Thêm một đối tượng thành công");
                    }
                    break;
                case 2:
                    if (animals.size() > 0) {
                        ShowAnimals(animals);
                    }else {
                        showMessage("Danh sách rỗng");
                    }
                    break;
                case 3:
                    if (animals.size() > 0){
                        Collections.sort(animals,new SortByName());
                        ShowAnimals(animals);
                    }else {
                        showMessage("Danh sách rỗng");
                    }
                    break;
                case 4:
                    if (animals.size() > 0){
                        Collections.sort(animals,new SortByHeightDESC());
                        ShowAnimals(animals);
                    }else {
                        showMessage("Danh sách rỗng");
                    }
                    break;
                case 5:
                    if (animals.size() > 0){
                        Collections.sort(animals,new SortByWeightDESC());
                        ShowAnimals(animals);
                    }else {
                        showMessage("Dánh sách rỗng");
                    }
                    break;
                case 6:
                    if (animals.size() > 0){
                        Collections.sort(animals,new SortByWeightASC());
                        ShowAnimals(animals);
                    }else {
                        showMessage("Dánh sách rỗng");
                    }
                    break;
                default:
                    showMessage("Sai chức năng, vui lòng thử lại!");
                    break;
            }
        } while (choice != 0);
    }

    private static void ShowAnimals(ArrayList<Animal> animals) {
        System.out.printf("%-25s%-20s%-15s%-15s\n", "Tên động vật", "Loài động vật",
                "Chiều cao", "Cân nặng");
        for (var animal : animals) {
            System.out.printf("%-25s%-20s%-15s%-15s\n", animal.getName(), animal.getSpecies(),
                    animal.getHeight(), animal.getWeight());
        }
    }

    private static Animal createAnimal(Scanner input) {
        System.out.println("chọn loài: \n1. Cá.\n2. Chim.\n3. Động vật có vú.");
        var option = Integer.parseInt(input.nextLine());
        System.out.println("Tên động vật: ");
        var name = input.nextLine();
        System.out.println("Giống loài: ");
        var species = input.nextLine();
        System.out.println("Chiều cao: ");
        var height = Float.parseFloat(input.nextLine());
        System.out.println("Cân nặng: ");
        var weight = Float.parseFloat(input.nextLine());
        switch (option) {
            case 1:
                return new Fish(name, species, height, weight);
            case 2:
                return new Bird(name, species, height, weight);
            case 3:
                return new Mammal(name, species, height, weight);
            default:
                showMessage("Sai tùy chọn. Vui lòng thực hiện lại!");
                break;
        }
        return null;
    }

    private static void showMessage(String s) {
        System.out.println("==> " + s + " <==");
    }
}
