package dev.ram1.SplitWise.service;

import dev.ram1.SplitWise.entity.User;

public interface UserService {
    User signup(String name, String email, String password);

}
