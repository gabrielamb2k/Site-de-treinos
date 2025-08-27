package aplicativo.treino.Gerador.de.treinos.service;

import aplicativo.treino.Gerador.de.treinos.domain.user.User;
import aplicativo.treino.Gerador.de.treinos.domain.workout.Workout;
import aplicativo.treino.Gerador.de.treinos.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Service é a camada de serviço da aplicação
 * responsável pela logica do negocio
 * @version 1.0
 */
@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    /**
     * Metodo para achar ou criar um novo usuario
     * @param user
     * @return caso o usuario ja tenha se registrado com seu email, retorna o usuario salvo
     * senao, retorna um novo usuario
     */
    public User findOrCreateUser(User user){
        User newUser = new User(user.getName(), user.getEmail());

        Optional<User> existingUser = userRepository.findEmail(newUser.getEmail());
        if(existingUser.isPresent()){
            return existingUser.get();
        }

        return userRepository.save(newUser);
    }

    /**
     * salva o treino gerado pertencente ao usuario no repositorio
     * @param workoutList
     * @param user
     */
    public void saveWorkoutToUser(List<Workout> workoutList,User user){
        // Busca o id do usuario na lista de usuarios e adiciona o treino a ele
        for(User userArmazenado : userRepository.findAll()){
            if(userArmazenado.getId().equals(user.getId())){
                userArmazenado.getWorkoutList().addAll(workoutList);
            }
        }
    }

    /**
     * Lista os treinos que o usuario gerou
     * @param user
     * @return lista de treinos
     */
    public List<Workout> workoutList(User user){
        // Busca o user por id e retorna a lista de treinos gerados por ele
        for(User userArmazenado : userRepository.findAll()){
            if(userArmazenado.getId().equals(user.getId())){
                return userArmazenado.getWorkoutList();
            }
        }
        return List.of();
    }
}
