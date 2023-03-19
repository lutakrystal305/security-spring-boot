package org.example.Payload.Response;

import org.example.Entity.Role;

import java.util.List;
import java.util.UUID;

public class LoginResponse {
    public String token;
    public String type;
    public UUID id;
    public String username;
    public String email;
    public List<String> roles;

    public LoginResponse() {
    }

    public LoginResponse(String token, UUID id, String username, String email, List<String> roles) {
        this.token = token;
        this.id = id;
        this.username = username;
        this.email = email;
        this.roles = roles;
    }

    public LoginResponse(String token, String type, UUID id, String username, String email, List<String> roles) {
        this.token = token;
        this.type = type;
        this.id = id;
        this.username = username;
        this.email = email;
        this.roles = roles;
    }

    public LoginResponse(String token, String type, UUID id, String username, String email) {
        this.token = token;
        this.type = type;
        this.id = id;
        this.username = username;
        this.email = email;
    }

    public LoginResponse(String token, UUID id, String username, String email) {
        this.token = token;
        this.id = id;
        this.username = username;
        this.email = email;
    }

}
