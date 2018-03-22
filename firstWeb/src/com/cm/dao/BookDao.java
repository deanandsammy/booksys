package com.cm.dao;

import com.cm.entity.Book;
import com.cm.util.BaseDao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
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

    // 添加书籍
    public int add(Book b) {

        String sql = "insert into book(name,price,author,pubDate) values (?,?,?,?)";
        String pubDate = new SimpleDateFormat("yyyy-MM-dd").format(b.getPubDate());

        return executeUpdate(sql, b.getName(), b.getPrice(), b.getAuthor(), pubDate);
    }
}
