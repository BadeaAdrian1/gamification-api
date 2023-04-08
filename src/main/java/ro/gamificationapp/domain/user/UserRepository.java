package ro.gamificationapp.domain.user;


public interface UserRepository {
    User findByEmail(final String email);
}
