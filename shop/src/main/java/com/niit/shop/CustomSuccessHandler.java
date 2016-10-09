package com.niit.shop;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

@Component
public class CustomSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {
 
    private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
 
    @Override
    protected void handle(HttpServletRequest request, HttpServletResponse response, Authentication authentication)
            throws IOException {
        String targetUrl = determineTargetUrl(authentication);
 
        if (response.isCommitted()) {
            System.out.println("Can't redirect");
            return;
        }
 
        redirectStrategy.sendRedirect(request, response, targetUrl);
    }
 
    /*
     * This method extracts the roles of currently logged-in user and returns
     * appropriate URL according to his/her role.
     */
    protected String determineTargetUrl(Authentication authentication) {
        String url = "";
 
        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
 
        List<String> role = new ArrayList<String>();
 
        for (GrantedAuthority a : authorities) {
            role.add(a.getAuthority());
        }
 
        if (isAdmin(role)) {
            url = "/Home";
        } else if (isUser(role)) {
            url = "/user";
        } else {
            url = "/accessDenied";
        }
 
        return url;
    }
 
    private boolean isUser(List<String> role) {
        if (role.contains("ROLE_USER")) {
            return true;
        }
        return false;
    }
 
    private boolean isAdmin(List<String> role) {
        if (role.contains("ROLE_ADMIN")) {
            return true;
        }
        return false;
    }
 
    
 
    public void setRedirectStrategy(RedirectStrategy redirectStrategy) {
        this.redirectStrategy = redirectStrategy;
    }
 
    protected RedirectStrategy getRedirectStrategy() {
        return redirectStrategy;
    }
 
}