package com.example.controller;

import com.example.model.Entity;
import com.example.service.CrudService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.doThrow;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

public class CrudControllerTest {

    private MockMvc mockMvc;

    @Mock
    private CrudService crudService;

    @InjectMocks
    private CrudController crudController;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(crudController).build();
    }

    @Test
    public void testCreateEntity() throws Exception {
        Entity entity = new Entity();
        entity.setId(1L);
        entity.setName("Test Entity");

        when(crudService.saveEntity(any(Entity.class))).thenReturn(entity);

        mockMvc.perform(post("/api/entities")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"name\": \"Test Entity\"}"))
                .andExpect(status().isOk())
                .andExpect(content().json("{\"id\":1,\"name\":\"Test Entity\"}"));
    }

    @Test
    public void testCreateEntityError() throws Exception {
        doThrow(new RuntimeException("Error creating entity")).when(crudService).saveEntity(any(Entity.class));

        mockMvc.perform(post("/api/entities")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"name\": \"Test Entity\"}"))
                .andExpect(status().isInternalServerError())
                .andExpect(jsonPath("$.message").value("Error creating entity"));
    }

    // Hands on exercise – Write unit tests​

}
