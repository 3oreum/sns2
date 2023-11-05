package com.resns.post.Mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.resns.post.domain.Post;

@Repository
public interface PostMapper {

	public List<Post> selectPostList();
}
