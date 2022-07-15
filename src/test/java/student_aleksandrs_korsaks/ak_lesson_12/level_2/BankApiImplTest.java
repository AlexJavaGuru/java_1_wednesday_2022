package student_aleksandrs_korsaks.ak_lesson_12.level_2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


class BankApiImplTest {

    List<BankClient> clients;
    List<Role> roles;
    BankApi api;
    UserCredentials credentials;
    BankClient clientOne, clientTwo;

    @BeforeEach
    void setUp() {
        clients = new ArrayList<>();
        clientOne = new BankClient("1", "Ivan");
        clients.add(clientOne);
        clientTwo = new BankClient("2", "Pjotr");
        clients.add(clientTwo);
        api = new BankApiImpl(clients);
        roles = new ArrayList<>();
        credentials = new UserCredentials(roles);
    }

    @Test
    void shouldThrowExceptionWhenCredentialsNotHaveAppropriateRole() {
        assertThrows(AccessDeniedException.class, () -> api.findByUid(credentials, "1234"));
    }

    @Test
    void shouldNotThrowExceptionWhenCredentialsHaveAppropriateRole() {
        roles.add(Role.CAN_SEARCH_CLIENTS);
        assertDoesNotThrow(() -> api.findByUid(credentials, "1234"));
    }

    @Test
    void findByUidPositive() throws AccessDeniedException {
        roles.add(Role.CAN_SEARCH_CLIENTS);
        assertEquals(Optional.of(clientOne), api.findByUid(credentials, "1"));
    }

    @Test
    void findByUidNegative() throws AccessDeniedException {
        roles.add(Role.CAN_SEARCH_CLIENTS);
        assertEquals(Optional.empty(), api.findByUid(credentials, "3"));
    }
}