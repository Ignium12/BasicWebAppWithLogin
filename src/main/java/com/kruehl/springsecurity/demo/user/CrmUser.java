package com.kruehl.springsecurity.demo.user;

import com.kruehl.springsecurity.demo.validation.FieldMatch;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@FieldMatch.List({
        @FieldMatch(first = "password", second = "matchingPassword", message = "The password fields must match")
})
public class CrmUser {

    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private String userName;

    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private String password;

    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private String matchingPassword;

    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private String firstName;

    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private String lastName;

    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private String email;

    public CrmUser() {
    }

    public CrmUser(@NotNull(message = "is required") @Size(min = 1, message = "is required") String userName, @NotNull(message = "is required") @Size(min = 1, message = "is required") String password, @NotNull(message = "is required") @Size(min = 1, message = "is required") String matchingPassword, @NotNull(message = "is required") @Size(min = 1, message = "is required") String firstName, @NotNull(message = "is required") @Size(min = 1, message = "is required") String lastName, @NotNull(message = "is required") @Size(min = 1, message = "is required") String email) {
        this.userName = userName;
        this.password = password;
        this.matchingPassword = matchingPassword;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMatchingPassword() {
        return matchingPassword;
    }

    public void setMatchingPassword(String matchingPassword) {
        this.matchingPassword = matchingPassword;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
