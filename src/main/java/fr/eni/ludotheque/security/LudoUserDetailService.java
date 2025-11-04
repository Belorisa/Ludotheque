package fr.eni.ludotheque.security;

import fr.eni.ludotheque.bo.Utilisateur;
import fr.eni.ludotheque.dal.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class LudoUserDetailService implements UserDetailsService {

    private final UserRepository userRepository;

    @Autowired
    public LudoUserDetailService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //UserDetails utilisateur =  User.withUsername("bob").password("azerty").roles("VENDEUR").build();
        Utilisateur utilisateur = userRepository.findUtilisateurByLogin(username);
        return User.withUsername(utilisateur.getLogin()).password(utilisateur.getPassword()).roles(utilisateur.getRole()).build();
    }
}
