package demos;

import java.util.Scanner;

public class AddressGenerator {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new AddressGenerator().run();
    }

    private void run() {
        System.out.print("Are you male, female or a company > ");
        String gender = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        boolean isCompany = false;

        if (gender.equalsIgnoreCase("Male")) {
            sb.append("Dear Mr ");
        } else if (gender.equalsIgnoreCase("Female")) {
            sb.append("Dear Ms/Mrs ");
        } else if (gender.equalsIgnoreCase("Company")) {
                sb.append("Dear Employees of the company ");
            isCompany = true;
        }

        if (isCompany)
            System.out.print("Enter your company name > ");
        else
            System.out.print("Enter your lastname > ");
        sb.append(sc.nextLine());

        System.out.println(sb);
    }
}
