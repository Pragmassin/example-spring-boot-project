package springboot.example.simpleauth.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import springboot.example.simpleauth.api.HealthcheckApi;
import springboot.example.simpleauth.model.HealthcheckResponse;

@RestController
@Slf4j
public class HealthcheckController implements HealthcheckApi {
    @Override
    public ResponseEntity<HealthcheckResponse> healthcheck() {
        HealthcheckResponse response = new HealthcheckResponse()
                .status("200")
                .msg("Application is Running!");
        return ResponseEntity.ok(response);
    }
}
