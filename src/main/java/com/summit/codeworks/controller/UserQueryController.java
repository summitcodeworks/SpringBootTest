package com.summit.codeworks.controller;


import com.summit.codeworks.model.ApiResponse;
import com.summit.codeworks.model.UserQuery;
import com.summit.codeworks.service.UserQueryService;
import jakarta.persistence.Access;
import jakarta.persistence.PostLoad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user_query")
@CrossOrigin(origins = "*")
public class UserQueryController {

    private final UserQueryService userQueryService;

    @Autowired
    public UserQueryController(UserQueryService userQueryService) {
        this.userQueryService = userQueryService;
    }

    @PostMapping("/save_query")
    public ResponseEntity<ApiResponse<UserQuery>> saveUserQuery(@RequestBody UserQuery userQuery) {
        UserQuery savedUserQuery = userQueryService.save(userQuery);

        ApiResponse<UserQuery> apiResponse = new ApiResponse<>(201, "Created", savedUserQuery);

        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }
}
