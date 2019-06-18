package cn.edu.gzmu.resource;

import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * 测试
 *
 * @author echo
 * @date 19-6-18 上午11:45
 */
@RestController
public class TestController {
    @GetMapping("/user")
    public HttpEntity<?> userInfo(Principal principal) {
        return ResponseEntity.ok(principal);
    }
}
