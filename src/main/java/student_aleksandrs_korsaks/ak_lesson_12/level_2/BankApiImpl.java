package student_aleksandrs_korsaks.ak_lesson_12.level_2;

import java.util.List;
import java.util.Optional;

class BankApiImpl implements BankApi {

    private List<BankClient> clients;

    public BankApiImpl(List<BankClient> clients) {
        this.clients = clients;
    }

    public Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException {

        if (credentials.getRoles().stream().anyMatch(role -> role.equals(Role.CAN_SEARCH_CLIENTS))) {
            throw new AccessDeniedException();
        }
        return clients.stream().filter(bankClient -> bankClient.getUid().equals(uid)).findAny();
    }

}
