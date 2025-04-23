package com.edu.bancodigital.bancodigital.Services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.bancodigital.bancodigital.domain.user.User;
import com.edu.bancodigital.bancodigital.domain.user.UserType;
import com.edu.bancodigital.bancodigital.dtos.UserDTO;
import com.edu.bancodigital.bancodigital.repositories.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    public void validateTransaction(User sender, BigDecimal amount){
        if (sender.getUserType() == UserType.MERCHANT) {
            throw new IllegalArgumentException("Merchant cannot send money.");
        }
        
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero.");
        }
        
        if (sender.getBalance().compareTo(amount) < 0) {
            throw new IllegalArgumentException("Insufficient funds.");
        }
    }

    public User findUserById(Long id){
        return this.userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("User not found"));
    }
    
    public void saveUser(User user) {
        this.userRepository.save(user);
    }

    public User createUser(UserDTO data){
        User newUser = new User(data);
        this.saveUser(newUser);
        return newUser;
    }

    public List<User> getAllUsers(){
        return this.userRepository.findAll();
    }


    public void deleteUser(Long id) {
        this.userRepository.deleteById(id);
    }
}
