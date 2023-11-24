package gonggang.server.post;

import gonggang.server.common.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface PostRepository extends JpaRepository<Post, Long>{
}