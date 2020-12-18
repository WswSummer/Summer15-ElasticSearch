package com.wsw.myelasticsearch.service;

import com.wsw.myelasticsearch.entity.Blog;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.core.query.IndexQuery;
import org.springframework.data.elasticsearch.core.query.IndexQueryBuilder;
import org.springframework.stereotype.Service;

/**
 * @Author WangSongWen
 * @Date: Created in 13:50 2020/12/18
 * @Description:
 */
@Service
@Slf4j
public class ElasticSearchService {
    @Autowired
    private ElasticsearchRestTemplate elasticsearchRestTemplate;

    public void save(Blog blog){
        IndexQuery indexQuery = new IndexQueryBuilder()
                .withId(blog.getBlogId().toString())
                .withObject(blog)
                .build();

    }
}
