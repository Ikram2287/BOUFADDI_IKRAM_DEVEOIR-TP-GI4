package com.ensa.gi4.datatabase.impl;

import com.ensa.gi4.modele.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        User user = new User();
        user.setUsername(resultSet.getString("username"));
        user.setIdUser(resultSet.getLong("id_user"));
        user.setPassword(resultSet.getString("mdp"));
        user.setRole(resultSet.getString("role_user"));
        return user;
    }
}
