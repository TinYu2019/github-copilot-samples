import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import com.example.model.Entity;
import com.example.service.CrudService;

import java.util.List;

@RestController
@RequestMapping("/api/entities")
public class CrudController {

    @Autowired
    private CrudService crudService;

    @PostMapping
    public ResponseEntity<Entity> createEntity(@RequestBody Entity entity) {
        try {
            Entity createdEntity = crudService.saveEntity(entity);
            return ResponseEntity.ok(createdEntity);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Error creating entity", e);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Entity> getEntity(@PathVariable Long id) {
        Entity entity = crudService.findEntityById(id);
        return ResponseEntity.ok(entity);
    }

    @GetMapping
    public ResponseEntity<List<Entity>> getAllEntities() {
        List<Entity> entities = crudService.findAllEntities();
        return ResponseEntity.ok(entities);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Entity> updateEntity(@PathVariable Long id, @RequestBody Entity entity) {
        entity.setId(id);
        Entity updatedEntity = crudService.saveEntity(entity);
        return ResponseEntity.ok(updatedEntity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEntity(@PathVariable Long id) {
        crudService.deleteEntity(id);
        return ResponseEntity.noContent().build();
    }

    // Hands on exercise – Code Suggestion​
    
}