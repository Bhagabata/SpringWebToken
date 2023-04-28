package com.springAss.dao;

import java.util.List;

import com.springAss.model.Contents;

public interface ContentDao {
public void save(Contents content);
public Contents get(int id);
public int delete(int id);
public List<Contents>list();

}
