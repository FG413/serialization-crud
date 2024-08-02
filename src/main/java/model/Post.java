package model;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class Post {
    private int id;
    private String content;
    private PostStatus status;
    private List<Label> labels;
}
