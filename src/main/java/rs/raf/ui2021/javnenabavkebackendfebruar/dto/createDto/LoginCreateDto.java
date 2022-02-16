package rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto;

import javax.validation.constraints.NotEmpty;

public class LoginCreateDto {

    @NotEmpty
    private String username;
    @NotEmpty
    private String password;

    public LoginCreateDto() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}