package com.edu.bancodigital.bancodigital.dtos;

import com.edu.bancodigital.bancodigital.domain.user.UserType;

public record UserDTO (String name, String document, String email, String password, UserType userType){
    
}
