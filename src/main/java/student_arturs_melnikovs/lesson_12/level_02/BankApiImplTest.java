package student_arturs_melnikovs.lesson_12.level_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class BankApiImplTest {
    public static void main(String[] args) {
        BankApiImplTest tester = new BankApiImplTest();
        tester.testFindByUid1();
        tester.testFindByUid2();
        tester.testFindByUid3();
    }

    private void testFindByUid3() {
        List<BankClient> bankClients = new ArrayList<>();
        BankClient client1 = new BankClient("1111", "client 1");
        BankClient client2 = new BankClient("2222", "client 2");
        BankClient client3 = new BankClient("3333", "client 3");
        bankClients.add(client1);
        bankClients.add(client2);
        bankClients.add(client3);
        BankApi bankApi = new BankApiImpl(bankClients);
        List<Role> roles = new ArrayList<>();
        roles.add(Role.CAN_SEARCH_CLIENTS);
        UserCredentials credentials = new UserCredentials(roles);
        try {
            checkResult(bankApi.findByUid(credentials, "0000").equals(Optional.empty()));
        } catch (AccessDeniedException e) {
            System.out.println("Test FAILED");
        }
    }

    private void testFindByUid2() {
        List<BankClient> bankClients = new ArrayList<>();
        BankApi bankApi = new BankApiImpl(bankClients);
        List<Role> roles = new ArrayList<>();
        UserCredentials credentials = new UserCredentials(roles);
        try {
            bankApi.findByUid(credentials, "1111");
            System.out.println("Test has FAILED");
        } catch (AccessDeniedException e) {
            System.out.println("Test has passed");
        }
    }

    private void testFindByUid1() {
        List<BankClient> bankClients = new ArrayList<>();
        BankClient client1 = new BankClient("1111", "client 1");
        BankClient client2 = new BankClient("2222", "client 2");
        BankClient client3 = new BankClient("3333", "client 3");
        bankClients.add(client1);
        bankClients.add(client2);
        bankClients.add(client3);
        BankApi bankApi = new BankApiImpl(bankClients);
        List<Role> roles = new ArrayList<>();
        roles.add(Role.CAN_SEARCH_CLIENTS);
        UserCredentials credentials = new UserCredentials(roles);
        try {
            checkResult(bankApi.findByUid(credentials, "1111").equals(Optional.of(client1)));
        } catch (AccessDeniedException e) {
            System.out.println("Test FAILED");
        }

    }


    private void checkResult(boolean actual) {
        if (actual) {
            System.out.println("Test has passed");
        } else {
            System.out.println("Test has FAILED!");
        }
    }

}
