public class CrudService {

    private final CrudRepository crudRepository;

    public CrudService(CrudRepository crudRepository) {
        this.crudRepository = crudRepository;
    }

    public Entity saveEntity(Entity entity) {
        return crudRepository.save(entity);
    }

    public List<Entity> findAllEntities() {
        return crudRepository.findAll();
    }

    public Optional<Entity> findEntityById(Long id) {
        return crudRepository.findById(id);
    }

    public void deleteEntity(Long id) {
        crudRepository.deleteById(id);
    }
}