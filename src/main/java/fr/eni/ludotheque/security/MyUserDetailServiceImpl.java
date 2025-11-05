package fr.eni.ludotheque.security;

import fr.eni.ludotheque.bo.Utilisateur;
import fr.eni.ludotheque.dal.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Role;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class MyUserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;


    private static final Logger log = LoggerFactory.getLogger(MyUserDetailServiceImpl.class);

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        log.debug("loadUserByUsername - start");

        Utilisateur use = userRepository.findUtilisateurByLogin(login);
        System.out.println(login);
        UserDetails user = null;
        System.out.println(use);
        if (use != null) {

            Set<Role> roles = new HashSet<>();

            user = User.builder()
                    .username(use.getLogin())
                    .password(use.getPassword())
                    .roles(use.getRole())
                    .build();

        } else {
            log.error("loadUserByUsername - username not found");
            throw new UsernameNotFoundException("username not found");
        }
        log.info("loadUserByUsername - end");
        return user;
    }
}
