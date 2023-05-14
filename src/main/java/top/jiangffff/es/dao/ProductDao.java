package top.jiangffff.es.dao;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;
import top.jiangffff.es.Entity.Product;

/**
 * @author JiangHuifeng
 * @create 2023-05-14-17:34
 */
@Repository
public interface ProductDao extends ElasticsearchRepository<Product, Long> {
}
