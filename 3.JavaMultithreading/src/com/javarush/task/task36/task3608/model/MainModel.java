package com.javarush.task.task36.task3608.model;

import com.javarush.task.task36.task3608.bean.User;
import com.javarush.task.task36.task3608.model.service.UserService;
import com.javarush.task.task36.task3608.model.service.UserServiceImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pradd on 15.10.2017.
 */
public class MainModel implements Model {

    private ModelData modelData = new ModelData();
    private UserService userService = new UserServiceImpl();

    @Override
    public ModelData getModelData() {
        return this.modelData;
    }

    private List<User> getAllUsers(){
        List<User> users = new ArrayList<>();
        users = userService.getUsersBetweenLevels(1, 100);
        return userService.filterOnlyActiveUsers(users);
    }

    @Override
    public void loadUsers() {
        List<User> users = new ArrayList<>();
        users = getAllUsers();


        modelData.setUsers(users);
        modelData.setDisplayDeletedUserList(false);
    }

    @Override
    public void loadDeletedUsers() {
        List<User> users = new ArrayList<>();
        users = userService.getAllDeletedUsers();

        modelData.setUsers(users);
        modelData.setDisplayDeletedUserList(true);
    }

    @Override
    public void loadUserById(long userId) {
        User user = userService.getUsersById(userId);
        modelData.setActiveUser(user);

    }

    public void deleteUserById(long userId) {
        userService.deleteUser(userId);
        List<User> users = new ArrayList<>();
        users = getAllUsers();
        modelData.setUsers(users);
        modelData.setDisplayDeletedUserList(false);
    }

    public void changeUserData(String name, long id, int level) {
        User user = userService.createOrUpdateUser(name, id, level);
        List<User> users = getAllUsers();
        modelData.setUsers(users);
        modelData.setDisplayDeletedUserList(false);
    }


}
