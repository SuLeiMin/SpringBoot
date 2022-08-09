package com.example.SpringBootWithMyBatis.Repository;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.SpringBootWithMyBatis.dto.UserSearchRequest;
import com.example.SpringBootWithMyBatis.entity.User;
/**
 * ユーザー情報 Mapper
 */
@Mapper
public interface UserMapper {
    /**
     * ユーザー情報検索
     * @param user 検索用リクエストデータ
     * @return ユーザー情報
     */
	@Select("SELECT * FROM userlist WHERE id = #{id}")
    User search(UserSearchRequest user);
}