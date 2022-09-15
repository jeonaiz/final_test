package kg.megacom.finally_test.services.impl;

import kg.megacom.finally_test.dao.UserDao;
import kg.megacom.finally_test.microservices.FileServiceFeign;
import kg.megacom.finally_test.microservices.json.Response;
import kg.megacom.finally_test.models.User;
import kg.megacom.finally_test.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    
    @Autowired
    private FileServiceFeign fileServiceFeign;
    
    @Override
    public User save(User user) {
        return userDao.save(user);
    }

    @Override
    public User getById(Long id) {
        return userDao.findById(id).orElse(null);
    }

    @Override
    public User update(User user) {
        if(userDao.existsById(user.getId())){
            return userDao.save(user);
        }
        return null;
    }

    @Override
    public User addUser(User user, MultipartFile file) {
        Response response = fileServiceFeign.upload(file);
        user.setImageUri(response.getDownloadUri());
        return save(user);
    }

}
