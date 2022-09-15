package kg.megacom.finally_test.services;

import kg.megacom.finally_test.models.User;
import org.springframework.web.multipart.MultipartFile;

public interface UserService {

    User save (User user);

    User getById(Long id);

    User update(User user);

    User addUser(User user, MultipartFile file);
}
