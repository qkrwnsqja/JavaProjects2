package mvc_jdbc_test.controller;

import jdbc_test.JDBCConnector;
import mvc_jdbc_test.entity.Customer;
import mvc_jdbc_test.view.CustomerView;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class CustomerInputController {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== 고객 정보 입력 시스템 ===");

        while (true) {
            // 고객 정보 입력
            Customer customer = inputCustomerInfo();

            if (customer == null) {
                // exit 입력 시 종료
                break;
            }

            // 데이터베이스에 저장
            boolean success = insertCustomer(customer);

            if (success) {
                System.out.println("\n✓ 고객 정보가 데이터베이스에 저장되었습니다.");

                // 저장된 정보 출력
                CustomerView customerView = new CustomerView();
                System.out.println("\n[저장된 정보]");
                customerView.printCustomer(customer);
            } else {
                System.out.println("\n✗ 고객 정보 저장에 실패했습니다.");
            }

            // 계속 추가할지 확인
            if (!continueInput()) {
                break;
            }
        }

        System.out.println("\n프로그램을 종료합니다.");
        scanner.close();
    }

    // 고객 정보 입력 메서드
    private static Customer inputCustomerInfo() {
        System.out.println("\n--- 고객 정보 입력 ---");
        System.out.println("(종료하려면 'exit' 입력)");

        Customer customer = new Customer();

        try {
            System.out.print("고객 아이디: ");
            String customerid = scanner.nextLine().trim();
            if (customerid.equalsIgnoreCase("exit")) {
                return null;
            }
            customer.setCustomerid(customerid);

            System.out.print("고객 이름: ");
            String customername = scanner.nextLine().trim();
            if (customername.equalsIgnoreCase("exit")) {
                return null;
            }
            customer.setCustomername(customername);

            System.out.print("나이: ");
            String ageInput = scanner.nextLine().trim();
            if (ageInput.equalsIgnoreCase("exit")) {
                return null;
            }
            customer.setAge(Integer.parseInt(ageInput));

            System.out.print("등급 (vip/gold/silver/bronze): ");
            String level = scanner.nextLine().trim();
            if (level.equalsIgnoreCase("exit")) {
                return null;
            }
            customer.setLevel(level);

            System.out.print("직업: ");
            String job = scanner.nextLine().trim();
            if (job.equalsIgnoreCase("exit")) {
                return null;
            }
            customer.setJob(job);

            System.out.print("적립금: ");
            String rewardInput = scanner.nextLine().trim();
            if (rewardInput.equalsIgnoreCase("exit")) {
                return null;
            }
            customer.setReward(Integer.parseInt(rewardInput));

            return customer;

        } catch (NumberFormatException e) {
            System.out.println("✗ 숫자 입력이 잘못되었습니다. 다시 시도해주세요.");
            return inputCustomerInfo(); // 재귀 호출로 다시 입력받기
        }
    }

    // 데이터베이스에 고객 정보 저장
    private static boolean insertCustomer(Customer customer) {
        Connection con = JDBCConnector.getConnection();
        String sql = "INSERT INTO 고객 (고객아이디, 고객이름, 나이, 등급, 직업, 적립금) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, customer.getCustomerid());
            ps.setString(2, customer.getCustomername());
            ps.setInt(3, customer.getAge());
            ps.setString(4, customer.getLevel());
            ps.setString(5, customer.getJob());
            ps.setInt(6, customer.getReward());

            int result = ps.executeUpdate();

            ps.close();
            con.close();

            return result > 0;

        } catch (SQLException e) {
            System.out.println("데이터베이스 오류: " + e.getMessage());
            try {
                if (con != null) con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            return false;
        }
    }

    // 계속 입력할지 확인하는 메서드
    private static boolean continueInput() {
        System.out.print("\n계속 추가하시겠습니까? (y/n 또는 exit): ");
        String answer = scanner.nextLine().trim().toLowerCase();

        if (answer.equals("exit")) {
            return false;
        }

        return answer.equals("y") || answer.equals("yes");
    }
}