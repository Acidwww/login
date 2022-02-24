package edu.heuet.shaohua.dao;

import edu.heuet.shaohua.dataobject.UserPasswordDO;
import org.springframework.stereotype.Repository;

@Repository
public interface UserPasswordDOMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(UserPasswordDO record);


    int insertSelective(UserPasswordDO record);


    UserPasswordDO selectByPrimaryKey(Integer id);
    UserPasswordDO selectByUserId(Integer UserId);

    int updateByPrimaryKeySelective(UserPasswordDO record);

    int updateByPrimaryKey(UserPasswordDO record);
}