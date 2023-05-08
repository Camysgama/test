package com.example.demo;

@Service
public class CurrentEntityService {

    private final CurrentEntityRepository currentEntityRepository;

    public CurrentEntityService(CurrentEntityRepository currentEntityRepository) {
        this.currentEntityRepository = currentEntityRepository;
    }

    public List<CurrentEntity> getAllCurrentEntities() {
        return currentEntityRepository.findAll();
    }

}

