package com.cm.dao;

import com.cm.entity.Book;
import com.cm.util.BaseDao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDao extends BaseDao {

    // 查询所有书籍
    public List<Book> getAll() {

        List<Book> list = new ArrayList<>();

        String sql = "select * from book";
        ResultSet rs = executeQuery(sql);

        try {
            while (rs.next()) {
                list.add(new Book(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4), rs.getDate(5)));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }
}
