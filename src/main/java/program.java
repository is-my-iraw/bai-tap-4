import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerOfficer managerOfficer = new ManagerOfficer();
        while (true){
            System.out.println("Quản lý cán bộ");
            System.out.println("1: thêm mới cán bộ");
            System.out.println("2: tìm kiếm theo họ tên ");
            System.out.println("3: Hiển thị thông tin về các danh sách cán bộ");
            System.out.println("4: thoát chương trình");
            String line = scanner.nextLine();
            switch (line){
                case "1":{
                    System.out.println("1: thêm mới kỹ sư");
                    System.out.println("2: thêm mới người làm việc");
                    System.out.println("3: thêm mới nhân viên");
                    String type = scanner.nextLine();
                    switch (type){
                        case "1":{
                            System.out.println("enter name:");
                            String name = scanner.nextLine();
                            System.out.println("enter age");
                            int age = scanner.nextInt();
                            System.out.println("enter gender");
                            scanner.nextLine();
                            String gender = scanner.nextLine();
                            System.out.println("enter address");
                            String address = scanner.nextLine();
                            System.out.println("enter branch");
                            String branch = scanner.nextLine();
                            Officer engineer = new Engineer(name, age, gender, address, branch);
                            managerOfficer.AddOfficers(engineer);
                            System.out.println(engineer.ToString());
                            break;
                        }
                        case "2":{
                            System.out.println("enter name:");
                            String name = scanner.nextLine();
                            System.out.println("enter age");
                            int age = scanner.nextInt();
                            System.out.println("enter gender");
                            scanner.nextLine();
                            String gender = scanner.nextLine();
                            System.out.println("enter address");
                            String address = scanner.nextLine();
                            System.out.print("Enter level: ");
                            int level = scanner.nextInt();
                            Officer worker = new Worker(name, age, gender, address, level);
                            managerOfficer.AddOfficers(worker);
                            System.out.println(worker.ToString());
                            scanner.nextLine();
                            break;
                        }
                        case "3":{
                            System.out.println("enter name:");
                            String name = scanner.nextLine();
                            System.out.println("enter age");
                            int age = scanner.nextInt();
                            System.out.println("enter gender");
                            scanner.nextLine();
                            String gender = scanner.nextLine();
                            System.out.println("enter address");
                            String address = scanner.nextLine();
                            System.out.print("Enter task: ");
                            String task = scanner.nextLine();
                            Officer staff = new Staff(name, age, gender, address, task);
                            managerOfficer.AddOfficers(staff);
                            System.out.println(staff.ToString());
                            scanner.nextLine();
                            break;
                        }
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                }
                case "2":{
                    System.out.println("enter name to search");
                    String search = scanner.nextLine();
                    managerOfficer.searchOfficerByName(search).forEach(officer -> {
                        System.out.println(officer.ToString());
                    });
                    break;
                }
                case "3":{
                    managerOfficer.showListInForOfficer();
                    break;
                }
                case "4":{
                    return;
                }
                default:
                    System.out.println("Invalid");
                    continue;
            }
        }
    }
}
