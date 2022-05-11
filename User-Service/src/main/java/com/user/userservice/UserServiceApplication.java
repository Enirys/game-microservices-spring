package com.user.userservice;

import com.user.userservice.entities.User;
import com.user.userservice.enums.RankType;
import com.user.userservice.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(UserRepository userRepository)
    {
        return args -> {
            userRepository.save(new User(null, "User1", RankType.Bronze, "zied@enirys.com", "pass",20));
            userRepository.save(new User(null, "User2", RankType.Diamond, "syrine@enirys.com","pass",23));
            userRepository.save(new User(null, "User3", RankType.None, "user3@enirys.com","pass",56));
            userRepository.save(new User(null, "User4", RankType.Gold, "fatma@enirys.com","pass",15));
            userRepository.save(new User(null, "User5", RankType.Iron, "user5@enirys.com","pass",0));
            userRepository.save(new User(null, "User6", RankType.Immortal, "user6@enirys.com","pass",12));
            userRepository.save(new User(null, "User7", RankType.Platinum, "user7@enirys.com","pass",32));
            userRepository.save(new User(null, "User8", RankType.Radiant, "user8@enirys.com","pass",20));
            userRepository.save(new User(null, "User9", RankType.Silver, "user9@enirys.com","pass",15));
            userRepository.save(new User(null, "User10", RankType.Immortal, "user10@enirys.com","pass",12));
            userRepository.save(new User(null, "User11", RankType.Platinum, "user11@enirys.com","pass",32));
            userRepository.save(new User(null, "User12", RankType.Radiant, "user12@enirys.com","pass",20));
            userRepository.save(new User(null, "User13", RankType.Silver, "user13@enirys.com","pass",15));
        };
    }
}
