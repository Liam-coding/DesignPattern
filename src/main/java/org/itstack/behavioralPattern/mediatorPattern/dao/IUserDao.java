package org.itstack.behavioralPattern.mediatorPattern.dao;

import org.itstack.behavioralPattern.mediatorPattern.po.User;

public interface IUserDao {
    User queryUserInfoById(Long id);
}
