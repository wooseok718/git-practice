package com.ohgiraffers.section02.annotation.subsection04.resource;

import com.ohgiraffers.section02.annotation.common.Pokemon;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("pokemonServiceResource")
public class PokemonService {
    /* 설명. @Primary보다 우선순위 높게 bead의 id(이름)로 하나의 bean을 선정*/



    @Resource       // Autowired와 같은 개념임
    private List<Pokemon> pokemonList;

    public void pokemonAttack() {
//        pokemonList.forEach(pokemon -> pokemon.attack());
// 람다식을 이용해 변형된 식을 남이 작성했을 때 해석을 할 줄 알아야한다
        pokemonList.forEach(Pokemon::attack);
    }

}
