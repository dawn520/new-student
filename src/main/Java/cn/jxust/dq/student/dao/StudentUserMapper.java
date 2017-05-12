package cn.jxust.dq.student.dao;

import cn.jxust.dq.student.entity.StudentUser;
import java.util.List;

public interface StudentUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StudentUser record);

    StudentUser selectByPrimaryKey(Integer id);

    List<StudentUser> selectAll();

    int updateByPrimaryKey(StudentUser record);
}