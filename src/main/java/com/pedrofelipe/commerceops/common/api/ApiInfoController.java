package com.pedrofelipe.commerceops.common.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ApiInfoController {

    @GetMapping
    public ResponseEntity<ApiInfoResponse> getApiInfo() {
        return ResponseEntity.ok(new ApiInfoResponse("CommerceOps API", "v1", "available"));
    }
}
