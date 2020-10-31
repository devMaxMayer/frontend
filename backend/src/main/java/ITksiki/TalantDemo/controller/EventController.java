package ITksiki.TalantDemo.controller;

import ITksiki.TalantDemo.dto.AuthenticationRequestDto;
import ITksiki.TalantDemo.entity.User;
import ITksiki.TalantDemo.security.jwt.JwtTokenProvider;
import ITksiki.TalantDemo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import static ITksiki.TalantDemo.security.jwt.JwtTokenFilter.ACCESS_TOKEN_COOKIE_NAME;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1/event/")
public class EventController {



    @GetMapping("all-events")
    public void login(@RequestBody AuthenticationRequestDto requestDto, final HttpServletResponse response) {

    }

}